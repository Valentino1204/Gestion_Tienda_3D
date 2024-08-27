$(document).ready(function() {
    cargarClientes();
  $('#clientes').DataTable();
});

    async function cargarClientes(){
          const request = await fetch('api/clientes', {
            method: 'GET',
            headers: {
              'Accept': 'application/json',
              'Content-Type': 'application/json'
            },
          });
          const clientes = await request.json();

        let listadoHTML = '';

            for (let cliente of clientes){
                let botonEliminar = '<a href="#" onclick="eliminarCliente(' + cliente.id + ')" class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a>';
                let botonEditar = '<a href="insert-cliente.html" class="btn btn-info btn-circle btn-sm"><i class="fas fa-edit"></i></a>';
                let usuarioHTML = '<tr>' +
                               '<td>'+cliente.id+'</td>' +
                               '<td>'+cliente.nombre+' '+cliente.apellido+'</td>' +
                               '<td>'+cliente.email+'</td>' +
                               '<td>'+cliente.telefono+'</td>' +
                               '<td>'+cliente.cuit+'</td>' +
                               '<td>'+botonEliminar+' '+botonEditar+'</td>' +

                               '</tr>';
                listadoHTML += usuarioHTML;
            }
            document.querySelector('#clientes tbody').outerHTML = listadoHTML;
    }

    async function eliminarCliente(id){

        if(!confirm("Desea eliminar el Cliente " +id+"?")){
            return;
        }
        const request = await fetch('api/clienteEliminar/' + id, {
                method: 'DELETE',
                headers: {
                  'Accept': 'application/json',
                  'Content-Type': 'application/json'
                }
        });

        location.reload();
    }

