package ItDev.AlmacenBazar.controller;

import ItDev.AlmacenBazar.model.Cliente;
import ItDev.AlmacenBazar.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class ClienteController {

    @Autowired
    private IClienteService clienteServ;

    @PostMapping ("clientes/crear")
    public String crearCliente(@RequestBody Cliente cliente) {
        clienteServ.crearCliente(cliente);
        return "Cliente creado"+ cliente.getNombre();
    }

    @GetMapping("clientes")
    public List<Cliente> listarClientes(){
        return clienteServ.listarClientes();
    }

    @GetMapping("clientes/{idCliente}")
    public ResponseEntity<Cliente> buscarCliente(@PathVariable Long idCliente){
        Cliente cliente = clienteServ.buscarCliente(idCliente);
        return ResponseEntity.ok(cliente);
    }

    @DeleteMapping("clientes/eliminar/{idCliente}")
    public String eliminarCliente(@PathVariable Long idCliente){
        clienteServ.eliminarCliente(idCliente);
        return "Cliente eliminado";
    }

    @PutMapping("clientes/editar")
    public Cliente editarCliente(@RequestBody Cliente cliente){
        clienteServ.editarCliente(cliente);
        return clienteServ.buscarCliente(cliente.getId_cliente());
    }
}
