$(document).ready(function() {
});


    async function agregarCliente(){
        let datos = {};
        datos.nombre = document.getElementById('txtNombre').value;
        datos.apellido = document.getElementById('txtApellido').value;
        datos.email = document.getElementById('txtEmail').value;
        datos.telefono = document.getElementById('txtTelefono').value;
        datos.cuit = document.getElementById('txtCuit').value;

        const request = await fetch('api/clientes/', {
            method: 'POST',
            headers: {
              'Accept': 'application/json',
              'Content-Type': 'application/json'
            },
            body: JSON.stringify(datos)
        });
    }

