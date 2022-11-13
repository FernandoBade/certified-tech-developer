// Fernando Bade
// Checkpoint 01 | Front-end 03
// Turma 06 | Prof. Wesley

// O pacote que utilizei como base do projeto:
// https://www.npmjs.com/package/react-credit-cards

// As principais vantagens do pacote é que ele ves estilizado e reconhece as bandeiras dos
// cartões (Visa, Mastercard, Hypercard, Elo, etc) com base nos números iniciais
// e muda dinamicamente a cor para se adequar. Também vem imbutido com uma animação
// de flip para visualizar o verso do cartão.

import React from "react";
import Card from "react-credit-cards";
import { formatCreditCardNumber, formatCVC, formatExpirationDate, formatFormData } from "./utils";
import "react-credit-cards/es/styles-compiled.css";
export default class App extends React.Component {
  state = {
    number: "",
    name: "",
    expiry: "",
    cvc: "",
    focused: "",
    formData: null
  };

  //Utilizei handlers para setar os estados
  handleInputFocus = ({ target }) => {
    this.setState({
      focused: target.name
    });
  };

  handleInputChange = ({ target }) => {
    if (target.name === "number") {
      target.value = formatCreditCardNumber(target.value);
    } else if (target.name === "expiry") {
      target.value = formatExpirationDate(target.value);
    } else if (target.name === "cvc") {
      target.value = formatCVC(target.value);
    }
    this.setState({ [target.name]: target.value });
  };

  handleSubmit = e => {
    e.preventDefault();


    const formData = [...e.target.elements]
      .filter(d => d.name)
      .reduce((acc, d) => {
        acc[d.name] = d.value;
        return acc
      }, {});
    this.setState({ formData });
    alert("Novo cartão criado com sucesso!")
    this.form.reset();

  };

  render() {
    const { name, number, expiry, cvc, focused, formData } = this.state;
    return (
      <div>
        <div className="App-payment">
          <h1>Cadastro de Cartões de Crédito</h1>
          <h4>Adicione seus cartões preferidos para agilizar suas próximas compras</h4>
          <Card
            number={number}
            name={name}
            expiry={expiry}
            cvc={cvc}
            focused={focused}
            callback={this.handleCallback}
          />
          <form ref={c => (this.form = c)} onSubmit={this.handleSubmit}>
            {/*As validações do número do cartão seguem o formato de 4 grupos de 4 caracteres */}
            <div>
              <input
                type="tel"
                name="number"
                className="form-control"
                placeholder="Número do cartão"
                maxLength="19"
                pattern="[\d| ]{16,22}"
                onChange={this.handleInputChange}
                onFocus={this.handleInputFocus}
                required
              />
            </div>
            <div>
              <input
                type="text"
                name="name"
                className="form-control"
                placeholder="Nome completo"
                onChange={this.handleInputChange}
                onFocus={this.handleInputFocus}
                required
              />
            </div>
            <div>
              <div>
                <input
                  type="tel"
                  name="expiry"
                  className="form-control"
                  placeholder="Validade"
                  pattern="\d\d/\d\d"
                  required
                  onChange={this.handleInputChange}
                  onFocus={this.handleInputFocus}
                />
              </div>
              <div>
                <input
                  type="tel"
                  name="cvc"
                  className="form-control"
                  placeholder="Código de segurança"
                  maxLength="3"
                  pattern="\d{3}"
                  required
                  onChange={this.handleInputChange}
                  onFocus={this.handleInputFocus}
                />
              </div>
            </div>
            <div>
              <button className="btnSave">Salvar Cartão</button>
            </div>
          </form>
          <hr />
          <div className="addedCards">
            <Card
              name="Wesley Bruno"
              number="4004 4004 4004 4004"
              expiry="11/22"
              cvc="999"
            />
            <Card
              name="Fernando Bade"
              number="5005 5005 5005 5005"
              expiry="11/22"
              cvc="999"
            />

            {formData && (
              <div className="App-highlight">
                {formatFormData(formData).map((d, i) => (
                  <div key={i}>{d}</div>
                ))}
              </div>
            )}

          </div>
        </div>
      </div>
    );
  }
}