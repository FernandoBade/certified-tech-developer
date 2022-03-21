const registerBtn = document.querySelector(".register-btn");

registerBtn.addEventListener("click", () => {


  /// Escreva aqui o seu código, seguindo estas orientações passo a passo:

  // 1. Obter o valor introduzido no input do e-mail.

  var email = document.getElementById('email-input').value
  // console.log(email);

  // 2. Obter o valor introduzido no input de senha.

  var senha = document.getElementById('password-input').value
  // console.log(senha);

  // 3. Obter o valor do input de rádio.

  var maioridade = document.getElementsByName("legalAge").checked
  // console.log(maioridade);

  // 4. Obter o valor do input com o checkbox.

  var termosCondicoes = document.getElementById('tyc-input').checked
  // console.log(termosCondicoes);

  // 5. Validar se o utilizador for maior de idade. Caso contrário, mostramos
  // uma mensagem de erro: "Tem de ser maior de idade para se registar no site".

 if (document.getElementById('age_yes').checked == false) {
    var idadeCheck = false
    alert("Tem de ser maior de idade para se registar no site")
  } else {
    idadeCheck = true
  }
  // 6. Validamos se o utilizador aceitou os termos e condições. Caso contrário, exibimos
  // uma mensagem de erro: "Deve aceitar os termos e condições para se registar no site".

  termosCondicoes === false ? alert('Deve aceitar os termos e condições para se registar no site') : true

  // 7. Por fim, se tudo estiver correto, exibimos um objeto no console com as informações definidas pelo utilizador. 
  var usuario = {
    Email: email,
    Senha: senha,
    MaiorDeIdade: idadeCheck,
    AceitouTermos: termosCondicoes
  }
  console.log(usuario)

});
