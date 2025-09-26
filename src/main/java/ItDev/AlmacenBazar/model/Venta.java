package ItDev.AlmacenBazar.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Entity
public class Venta {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idVenta;
    private LocalDate fecha_venta;
    private Double total;

    @OneToMany
    private List<Producto> listaProductos;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "idCliente", nullable = false)
    private Cliente unCliente;

    public Venta() {
    }

    public Venta(Cliente unCliente, List<Producto> listaProductos, Double total, LocalDate fecha_venta, Long idVenta) {
        this.unCliente = unCliente;
        this.listaProductos = listaProductos;
        this.total = total;
        this.fecha_venta = fecha_venta;
        this.idVenta = idVenta;
    }
}
