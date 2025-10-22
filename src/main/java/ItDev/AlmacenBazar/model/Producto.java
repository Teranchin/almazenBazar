package ItDev.AlmacenBazar.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter @Setter @Entity
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProducto;
    private String nombre;
    private String marca;
    private double precio;
    private double cantidad_disponible;

    @ManyToMany(mappedBy = "listaProductos")
    private List<Venta> ventas;

    public Producto() {
    }

    public Producto(Long idProducto, String nombre, String marca, double precio, double cantidad_disponible, List<Venta> ventas) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.cantidad_disponible = cantidad_disponible;
        this.ventas = ventas;
    }

    public Producto(Long idProducto, String nombre, String marca, double precio, double cantidad_disponible) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.cantidad_disponible = cantidad_disponible;
    }
}


