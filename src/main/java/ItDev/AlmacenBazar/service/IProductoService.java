package ItDev.AlmacenBazar.service;

import ItDev.AlmacenBazar.model.Producto;

import java.util.List;

public interface IProductoService {

    public void crearProducto(Producto producto);
    public void editarProducto(Producto producto);
    public void elminarProducto(Long idProducto);
    public Producto buscarProducto(Long idProducto);

    public List<Producto> listarProductos();

}
