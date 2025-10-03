package ItDev.AlmacenBazar.service;

import ItDev.AlmacenBazar.model.Venta;

import java.util.List;

public interface IVentaService {

    public void crearVenta(Venta venta);
    public void editarVenta(Venta venta);
    public void eliminarVenta(Long idVenta);
    public Venta leerVenta(Long idVenta);

    public List<Venta> listarVenta();


}
