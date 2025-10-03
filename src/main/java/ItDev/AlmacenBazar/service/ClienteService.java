package ItDev.AlmacenBazar.service;

import ItDev.AlmacenBazar.model.Cliente;
import ItDev.AlmacenBazar.model.Producto;
import ItDev.AlmacenBazar.repository.IClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService implements IClienteService {

    @Autowired
    private IClienteRepository clienteRepo;


    @Override
    public void crearCliente(Cliente cliente) {

        clienteRepo.save(cliente);
    }

    @Override
    public void editarCliente(Cliente cliente) {

        this.crearCliente(cliente);
    }

    @Override
    public void eliminarCliente(Long idCliente) {
        clienteRepo.deleteById(idCliente);
    }

    @Override
    public Cliente buscarCliente(Long idCliente) {

        Cliente cli = clienteRepo.findById(idCliente).orElse(null);
        return cli;
    }

    @Override
    public List<Cliente> listarClientes() {
        List<Cliente> listarCli = clienteRepo.findAll();
        return listarCli;
    }


}
