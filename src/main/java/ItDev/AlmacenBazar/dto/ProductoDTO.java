package ItDev.AlmacenBazar.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ProductoDTO {

    // dto/ProductoDTO.java
        private Long id_producto;
        private String nombre;
        private String marca;
        private Double precio;
        private Double cantidad_disponible;

        public ProductoDTO() { }

        public ProductoDTO(Long id_producto, String nombre, String marca,
                           Double precio, Double cantidad_disponible) {
            this.id_producto = id_producto;
            this.nombre = nombre;
            this.marca = marca;
            this.precio = precio;
            this.cantidad_disponible = cantidad_disponible;
        }

        // getters y setters
    }


