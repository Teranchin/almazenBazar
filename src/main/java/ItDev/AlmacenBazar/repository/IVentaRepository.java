package ItDev.AlmacenBazar.repository;

import ItDev.AlmacenBazar.dto.VentaProductoDTO;
import ItDev.AlmacenBazar.model.Producto;
import ItDev.AlmacenBazar.model.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IVentaRepository extends JpaRepository<Venta, Long> {

        /*@Query("SELECT v FROM Venta v JOIN FETCH v.listaProductos p " +
                "WHERE v.idVenta= :idVenta")
        Optional<Venta> findByIdWithProductos(@Param("idVenta") Long idVenta);

        @Query("SELECT v FROM Venta v LEFT JOIN FETCH v.listaProductos WHERE v.idVenta = :idVenta")
        Venta findByCodigoVentaWithProductos(@Param("idVenta") Long idVenta);
*/


}
