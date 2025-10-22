package ItDev.AlmacenBazar.dto;

import ItDev.AlmacenBazar.model.Producto;
import lombok.*;

import java.util.Date;
import java.util.List;

@Getter @Setter
public class VentaProductoDTO {

    private Long id_venta;
    private String nombreCliente;
    private List<Producto> productos;

    public VentaProductoDTO() {
    }

    public VentaProductoDTO(Long id_venta, String nombreCliente, List<Producto> productos) {
        this.id_venta = id_venta;
        this.nombreCliente = nombreCliente;
        this.productos = productos;
    }
}


