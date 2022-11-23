import axios from "axios";
import { useEffect, useState } from "react";
import "./styles.css";

const App = () => {
  const [users, setUsers] = useState([])
  const [idUser, setIdUser] = useState("")
  const [formData, setFormData] = useState({
    name: "",
    email: "",
    phone: "",
    birthDate: "",
  });

  useEffect(() => {
    getAllUsers();
  }, [])

  async function getAllUsers() {
    try {      
      const response = await axios.get('https://backend-dh.vercel.app/users')
      setUsers(response.data)
    } catch (error) {
      alert("Erro ao mostrar todos users" + error)
    }
  }

  async function createUser() {
    try {
      const response = await axios.post('https://backend-dh.vercel.app/users', {
        name: formData.name,
        email: formData.email,
        phone: formData.phone,
        birthDate: formData.birthDate,
      })
      //Limpando os inputs
      setFormData({name: "",
        email: "",
        phone: "",
        birthDate: ""
      })

      alert("Usuário cadastrado com sucesso!")
      getAllUsers();

    } catch (error) {
      alert("Erro ao tentar criar um usuário!" + error)
    }
  }

  function editUser(user) {
    const date = user.birthDate.split("T")[0];

    setFormData({
      name: user.name,
      email: user.email,
      phone: user.phone,
      birthDate: date,
    });

    setIdUser(user._id);
  }

  async function updateUser() {
    try {
      await axios.put(`https://backend-dh.vercel.app/users/${idUser}`,
        {  
          name: formData.name,
          email: formData.email,
          phone: formData.phone,
          birthDate: formData.birthDate,
        }
      );

      alert("Usuário editado com sucesso!");
      getAllUsers();

    } catch (error) {
      alert("Erro ao tentar atualizar usuário" + error)
    }
  }

  async function removeUser(idUser) {
    try {
      await axios.delete(`https://backend-dh.vercel.app/users/${idUser}`);
      alert("Usuário deletado com sucesso!")
      getAllUsers();

    } catch (error) {
      alert("Erro ao tentar deletar usuário!" + error)
    }
  }

  function submitForm() {
    console.log("func submit" + formData)
    if(idUser) {
      updateUser()
    }else{
      createUser()
    }
  }

  return (
    <div>
      <form>
        <input
          placeholder="Nome"
          value={formData.name}
          onChange={(event) =>
            setFormData({ ...formData, name: event.target.value })
          }
        />
        <input
          placeholder="Email"
          value={formData.email}
          onChange={(event) =>
            setFormData({ ...formData, email: event.target.value })
          }
        />
        <input
          placeholder="Telefone"
          value={formData.phone}
          onChange={(event) =>
            setFormData({ ...formData, phone: event.target.value })
          }
        />
        <input
          placeholder="Data de Nascimento"
          type="date"
          value={formData.birthDate}
          onChange={(event) =>
            setFormData({ ...formData, birthDate: event.target.value })
          }
        />
        <button type="button" onClick={submitForm}>
          Salvar
        </button>
      </form>

      <div className="container-table">
        <table>
          <thead>
            <tr>
              <th>Nome</th>
              <th>Email</th>
              <th>Telefone</th>
              <th>Data de nascimento</th>
              <th>Ações</th>
            </tr>
          </thead>
          <tbody>
            {users.map((user) => (
              <tr key={user._id}>
                <td>{user.name}</td>
                <td>{user.email}</td>
                <td>{user.phone}</td>
                <td>{user.birthDate}</td>
                <td>
                  <button onClick={() => editUser(user)}>Editar</button>
                  <button onClick={() => removeUser(user._id)}>Apagar</button>
                </td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    </div>
  );
};

export default App;