package ItDev.AlmacenBazar.repository;

import ItDev.AlmacenBazar.model.Producto;
import ItDev.AlmacenBazar.dto.ProductoDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductoRepository extends JpaRepository<Producto, Long> {

    // lista de todos los productos del mismo modo se muestran todos los atributos de la clase
    @Query("SELECT new ItDev.AlmacenBazar.model.Producto(p.idProducto, p.nombre, p.marca," +
            " p.precio, p.cantidad_disponible)  FROM Producto p")
    List<Producto> listarProd();


    // aplicamos el DTO solo mostrando los atributos que nos interesan
    @Query("SELECT new ItDev.AlmacenBazar.dto.ProductoDTO(p.idProducto, " +
            "p.nombre, p.marca, p.precio, p.cantidad_disponible)  FROM Producto p")
    List<ProductoDTO> listarProd2();

}
