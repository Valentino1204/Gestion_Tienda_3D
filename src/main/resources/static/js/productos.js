$(document).ready(function() {
    cargarProductos();
    $('#productos').DataTable();
});

    async function cargarProductos(){
        const request = await fetch('api/productos', {
            method: 'GET',
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
        });

        const productos = await request.json();

        console.log(productos);

        let listadoProductosHTML = '';

            for(let producto of productos){
                let precio = producto.precio;
                let botonEliminar = '<a href="#" onclick="eliminarProducto(' + producto.id + ')" class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a>';

                let productosHTML = '<tr>' +
                               '<td>'+producto.id+'</td>' +
                               '<td>'+producto.nombre+'</td>' +
                               '<td>'+producto.descripcion+'</td>' +
                               '<td>$ '+precio.toLocaleString()+'</td>' +
                               '<td>'+producto.gramos+'</td>' +
                               '<td>'+producto.horas+'</td>' +
                               '<td>'+producto.dimensiones+'</td>' +
                               '<td>'+producto.densidad_relleno+'%</td>' +
                               '<td>'+producto.tipo_relleno+'</td>' +
                               '<td>'+producto.altura_capa+'</td>' +
                               '<td>'+producto.tipo_soporte+'</td>' +
                               '<td>'+producto.voladizo_soporte+'</td>' +
                               '<td>'+producto.adherencia_cama+'</td>' +
                               '<td>'+producto.perimetros+'</td>' +
                               '<td>'+producto.insumos+'</td>' +
                               '<td>'+botonEliminar+'</td>' +
                               '</tr>';
                listadoProductosHTML += productosHTML;
            }

            document.querySelector('#productos tbody').outerHTML = listadoProductosHTML;
    }

    async function eliminarProducto(id){

            if(!confirm("Desea eliminar el Producto " +id+"?")){
                return;
            }
            const request = await fetch('api/productoEliminar/' + id, {
                    method: 'DELETE',
                    headers: {
                      'Accept': 'application/json',
                      'Content-Type': 'application/json'
                    }
            });

            location.reload();
        }