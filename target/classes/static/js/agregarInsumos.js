$(document).ready(function() {
});

    async function insertInsumo(){
        let datos = {};
        datos.nombre = document.getElementById('txtNombre').value;
        datos.precio = document.getElementById('txtPrecio').value;
        datos.stock = document.getElementById('txtStock').value;
        datos.lugar = document.getElementById('txtLugar').value;
        datos.fecha = document.getElementById('txtFecha').value;

        const request = await fetch('api/insumos/', {
            method: 'POST',
            headers: {
              'Accept': 'application/json',
              'Content-Type': 'application/json'
            },
            body: JSON.stringify(datos)
        });
    }

