package ItDev.AlmacenBazar.service;

import ItDev.AlmacenBazar.model.Cliente;

import java.util.List;

public interface IClienteService {

    public void crearCliente (Cliente cliente);
    public void editarCliente (Cliente cliente);
    public void eliminarCliente (Long idCliente);
    public Cliente buscarCliente (Long idCliente);

    public List<Cliente> listarClientes();

}
