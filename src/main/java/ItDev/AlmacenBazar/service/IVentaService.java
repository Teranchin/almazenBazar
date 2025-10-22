package ItDev.AlmacenBazar.service;

import ItDev.AlmacenBazar.dto.VentaProductoDTO;
import ItDev.AlmacenBazar.model.Venta;

import java.util.List;

public interface IVentaService {

    public void crearVenta(Venta venta);
    public void editarVenta(Venta venta);
    public void eliminarVenta(Long idVenta);
    public VentaProductoDTO leerVenta(Long idVenta);

    public List<Venta> listarVenta();
    public VentaProductoDTO getVentaProductoDTO(Long idVenta);


}
