package ItDev.AlmacenBazar.model;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Entity
public class Venta{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idVenta;
    private LocalDate fecha_venta;
    private Double total;

    @ManyToMany
    @JoinTable(
            name = "ventaProducto",
            joinColumns = @JoinColumn(name = "venta_id_venta"),
            inverseJoinColumns = @JoinColumn(name = "lista_productos_id_producto")
    )
    private List<Producto> listaProductos;

    @ManyToOne
    @JoinColumn//(name = "id_cliente", nullable = false)
    private Cliente unCliente;

    public Venta() {
    }

    public Venta(Long idVenta, LocalDate fecha_venta, Double total, List<Producto> listaProductos, Cliente unCliente) {
        this.idVenta = idVenta;
        this.fecha_venta = fecha_venta;
        this.total = total;
        this.listaProductos = listaProductos;
        this.unCliente = unCliente;
    }
}
