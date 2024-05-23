$(document).ready(function() {
    cargarInsumos();
  $('#insumos').DataTable();
});

    async function cargarInsumos(){
          const request = await fetch('api/insumos', {
            method: 'GET',
            headers: {
              'Accept': 'application/json',
              'Content-Type': 'application/json'
            },
          });
          const insumos = await request.json();

        let listadoHTML = '';

            for (let insumo of insumos){
                let calendario = '<input type="date" id="start" name="trip-start" value="'+insumo.fecha+'"/>'
                let botonEliminar = '<a href="#" onclick="eliminarInsumo(' + insumo.id + ')" class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a>';
                let usuarioHTML = '<tr>' +
                               '<td>' + insumo.id + '</td>' +
                               '<td>'+insumo.nombre+'</td>' +
                               '<td> $'+insumo.precio+'</td>' +
                               '<td>'+insumo.stock+'</td>' +
                               '<td>'+insumo.lugar+'</td>' +
                               '<td>'+calendario+'</td>' +
                               '<td>'+botonEliminar+'</td>' +
                               '</tr>';
                listadoHTML += usuarioHTML;
            }
            document.querySelector('#insumos tbody').outerHTML = listadoHTML;
    }

    async function eliminarInsumo(id){

        if(!confirm("Desea eliminar el Insumo " +id+"?")){
            return;
        }
        const request = await fetch('api/insumoEliminar/' + id, {
                method: 'DELETE',
                headers: {
                  'Accept': 'application/json',
                  'Content-Type': 'application/json'
                }
        });

        location.reload();
    }

