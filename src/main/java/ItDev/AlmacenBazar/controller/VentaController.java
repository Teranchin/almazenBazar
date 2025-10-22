package ItDev.AlmacenBazar.controller;

import ItDev.AlmacenBazar.dto.VentaProductoDTO;
import ItDev.AlmacenBazar.model.Producto;
import ItDev.AlmacenBazar.model.Venta;
import ItDev.AlmacenBazar.service.IVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class VentaController {

    @Autowired
    private IVentaService ventaServ;

    @GetMapping("produ")
    public List<Venta> listarVenta() {
        return ventaServ.listarVenta();
    }

    @GetMapping("venta/productos/{idVenta}")
    public ResponseEntity<VentaProductoDTO> leerVenta(@PathVariable Long idVenta)  {
        VentaProductoDTO ven = ventaServ.leerVenta(idVenta);
        return ResponseEntity.ok(ven);
    }
}
/*SELECT v.id_venta, c.nombre AS nombre_cliente, c.apellido AS apellido_cliente,
    p.nombre AS nombre_producto, p.marca, p.precio FROM
    venta v JOIN cliente c ON v.id_cliente = c.id_cliente JOIN venta_producto vlp ON v.id_venta = vlp.venta_id_venta JOIN producto p ON vlp.lista_productos_id_producto = p.id_producto WHERE v.id_venta = 1;*/