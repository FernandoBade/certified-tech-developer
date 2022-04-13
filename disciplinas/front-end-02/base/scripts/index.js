//consultamos si es que existe data del usuario en localstorage
if (!localStorage.user) {
  location.replace('login.html')
}
/* -------------------------------------------------------------------------- */
/*             realizamos la lógica una vez que carga el documento            */
/* -------------------------------------------------------------------------- */
window.addEventListener('load', function () {

  /* ---------- mostramos el nombre del usuario en la barra superior ---------- */
  const userName = document.querySelector('.user-info p');
  const deposito = JSON.parse(localStorage.user)
  userName.innerText = deposito.name;

  /* ---------------- creamos la funcionalidad de cerrar sesion --------------- */
  const btnCerrarSesion = document.querySelector('#closeApp');
  btnCerrarSesion.addEventListener('click', function () {
    let confirmacion = confirm("¿Desea cerrar sesion?")
    if (confirmacion) {
      //limpiamos el localstorage y redireccioamos a login
      localStorage.clear();
      location.replace('/login.html');
    }
  })

  
  const urlTareas = 'https://ctd-todo-api.herokuapp.com/v1/tasks'
  const usuario = JSON.parse(localStorage.user);
  const token = usuario.jwt;

  const formCrearTarea = document.querySelector('.nueva-tarea');
  const nuevaTarea = document.querySelector('#nuevaTarea');


  consultarTareas()

  /* -------------------------------------------------------------------------- */
  /*                          creando nueva tarea POST                          */
  /* -------------------------------------------------------------------------- */

  formCrearTarea.addEventListener('submit', function (event) {
    event.preventDefault();
    console.log("crear terea");
    console.log(nuevaTarea.value);

    const payload = {
      description: nuevaTarea.value.trim()
    };
    const settings = {
      method: 'POST',
      body: JSON.stringify(payload),
      headers: {
        'Content-Type': 'application/json',
        authorization: token
      }
    }
    console.log("Creando un tarea en la base de datos");
    fetch(urlTareas, settings)
      .then(response => response.json())
      .then(tarea => {
        console.log(tarea)
        consultarTareas()
      })
      .catch(error => console.log(error));


    //limpiamos el form
    formCrearTarea.reset();
  })

  
  
  /* -------------------------------------------------------------------------- */
  /*                        obtener listado de tareas GET                       */
  /* -------------------------------------------------------------------------- */

  function consultarTareas() {
    const settings = {
      method: 'GET',
      headers: {
        authorization: token
      }
    };
    console.log("Consultando mis tareas");
    fetch(urlTareas, settings)
      .then(response => response.json())
      .then(tareas => {
        console.log(tareas)
        //falso esqueleto que simula lo que va a ocupar el contenido
        const skeleton = document.querySelector('#skeleton');
        //lo borramos antes de cargar el contenido
        if (skeleton) {
          skeleton.remove();
        }

        renderizarTareas(tareas);
        botonCambioEstado();
        botonBorrarTarea();
      })
      .catch(error => console.log(error));
  }

  /* -------------------------------------------------------------------------- */
  /*                        renderizar tareas en el HTML                        */
  /* -------------------------------------------------------------------------- */

  function renderizarTareas(listado) {

    const tareasPendientes = document.querySelector('.tareas-pendientes');
    tareasPendientes.innerHTML = "";
    const tareasTerminadas = document.querySelector('.tareas-terminadas');
    tareasTerminadas.innerHTML = "";

    listado.forEach(tarea => {
      //variable intermedia para manipular la fecha
      let fecha = new Date(tarea.createdAt);

      if (tarea.completed) {
        //lo mandamos al listado de tareas incompletas
        tareasTerminadas.innerHTML += `
                        <li class="tarea">
                            <div class="done"></div>
                            <div class="descripcion">
                            <div>
                                <button><i id="${tarea.id}" class="fas fa-undo-alt change"></i></button>
                                <button><i id="${tarea.id}" class="far fa-trash-alt"></i></button>
                            </div>
                                <p class="nombre">${tarea.description}</p>
                                <p class="timestamp"><i class="far fa-calendar-alt"></i>${fecha.toLocaleDateString()} <i class="far fa-clock"></i>${fecha.getHours()}:${fecha.getMinutes()}</p>
                            </div>
                        </li>
                        `
      } else {
        //lo mandamos al listado de tareas terminadas
        tareasPendientes.innerHTML += `
                        <li class="tarea">
                            <div class="not-done change" id="${tarea.id}"></div>
                            <div class="descripcion">
                                <p class="nombre">${tarea.description}</p>
                                <p class="timestamp"><i class="far fa-calendar-alt"></i>${fecha.toLocaleDateString()} <i class="far fa-clock"></i>${fecha.getHours()}:${fecha.getMinutes()}</p>
                            </div>
                        </li>
                        `
      }
    })
  }

  /* -------------------------------------------------------------------------- */
  /*                        cambiar estado de tareas PUT                        */
  /* -------------------------------------------------------------------------- */

  function botonCambioEstado() {
    const btnCambioEstado = document.querySelectorAll('.change');

    btnCambioEstado.forEach(boton => {
      //a cada boton le asignamos una funcionalidad
      boton.addEventListener('click', function (event) {
        const id = event.target.id;
        const url = `${urlTareas}/${id}`
        const payload = {};

        if (event.target.classList.contains('fa-undo-alt')) {
          payload.completed = false;
        } else {
          payload.completed = true;
        }

        const settingsCambio = {
          method: 'PUT',
          headers: {
            "Authorization": token,
            "Content-type": "application/json"
          },
          body: JSON.stringify(payload)
        }
        fetch(url, settingsCambio)
          .then(response => {
            console.log(response.status);
            //renderizar nuevamente las tareas
            consultarTareas();
          })
      })
    });

  }

  /* -------------------------------------------------------------------------- */
  /*                             borrar tarea DELETE                            */
  /* -------------------------------------------------------------------------- */
  function botonBorrarTarea() {
    const btnBorrarTarea = document.querySelectorAll('.fa-trash-alt');

    btnBorrarTarea.forEach(boton => {
      //a cada boton le asignamos una funcionalidad
      boton.addEventListener('click', function (event) {
        const id = event.target.id;
        const url = `${urlTareas}/${id}`

        const settingsCambio = {
          method: 'DELETE',
          headers: {
            "Authorization": token,
          }
        }
        fetch(url, settingsCambio)
          .then(response => {
            console.log(response.status);
            //renderizar nuevamente las tareas
            consultarTareas();
          })
      })
    });

  }




});