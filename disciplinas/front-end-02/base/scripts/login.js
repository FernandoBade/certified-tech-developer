window.addEventListener('load', function () {
    /* ---------------------- obtenemos variables globales ---------------------- */
    const form = document.forms[0];
    const email = document.querySelector('#inputEmail')
    const password = document.querySelector('#inputPassword')
    const url = 'https://ctd-todo-api.herokuapp.com/v1/users/login';


    /* ------------------- escuchamos el submit del formulario ------------------ */
    form.addEventListener('submit', function (e) {
        e.preventDefault();
        //creamos el cuerpo de la request
        const payload = {
            email: email.value,
            password: password.value
        };
        //configuramos la request del Fetch
        const settings = {
            method: 'POST',
            body: JSON.stringify(payload),
            headers: {
                'Content-Type': 'application/json'
            }
        };

        /* ---------------------- lanzamos la peticion a la API --------------------- */
        console.log("Lanzando la consulta a la API");
        fetch(url, settings)
            .then(response => response.json())
            .then(data => {

                if (data.jwt) {
                    //armo un objeto literal con cierta info que quiero guardar en LocalStorage
                    const usuario = {
                        jwt: data.jwt,
                        name: email.value.split('@')[0]
                    }
                    //guardo en LocalStorage el objeto con el token y el nombre del usuario
                    localStorage.setItem('user', JSON.stringify(usuario));

                    //redireccionamos a la página
                    location.replace('/')
                }
                //limpio los campos del formulario
                form.reset();
            })
    });









});