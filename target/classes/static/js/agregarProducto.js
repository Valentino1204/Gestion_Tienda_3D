$(document).ready(function() {
});

    async function insertProducto(){
        let datos = {};
        datos.nombre = document.getElementById('txtNombre').value;
        datos.descripcion = document.getElementById('txtDescripcion').value;
        datos.precio = document.getElementById('txtPrecio').value;
        datos.gramos = document.getElementById('txtGramos').value;
        datos.horas = document.getElementById('txtHoras').value;
        datos.dimensiones = document.getElementById('txtDimensiones').value;
        datos.densidad_relleno = document.getElementById('txtDensidadRelleno').value;
        datos.voladizo_soporte = document.getElementById('txtVoladizoSoporte').value;
        datos.adherencia_cama = "true";
        datos.tipo_relleno = document.getElementById('txtTipoRelleno').value;
        datos.altura_capa = document.getElementById('txtAlturaCapa').value;
        datos.tipo_soporte = document.getElementById('txtTipoSoporte').value;
        datos.perimetros = document.getElementById('txtPerimetros').value;
        datos.insumos = document.getElementById('txtInsumos').value;


        const request = await fetch('api/productos/', {
            method: 'POST',
            headers: {
              'Accept': 'application/json',
              'Content-Type': 'application/json'
            },
            body: JSON.stringify(datos)
        });
    }

