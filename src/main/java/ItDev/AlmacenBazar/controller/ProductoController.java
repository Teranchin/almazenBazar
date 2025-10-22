package ItDev.AlmacenBazar.controller;

import ItDev.AlmacenBazar.model.Producto;
import ItDev.AlmacenBazar.dto.ProductoDTO;
import ItDev.AlmacenBazar.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class ProductoController {

    @Autowired
    private IProductoService proServ;

    //Creamos un producto en particular
    @PostMapping("producto/crear")
    public String crearProducto(@RequestBody Producto producto) {
        proServ.crearProducto(producto);
        return "Producto creada correctamente --> " + producto.getNombre();

    }

    //Obtenemos la lista completa de todos los productos

    @GetMapping("productos")
    public List<Producto> listarProduc() {
        return proServ.listarProductos();
    }

    @GetMapping("productos2")
    public List<ProductoDTO> listarProduc2() {
        return proServ.listarProductos2();
    }

    // Traemos un producto en particular
    @GetMapping("productos/{idProducto}")
    public ResponseEntity<Producto> buscarProducto(@PathVariable Long idProducto) {
        Producto producto = proServ.buscarProducto(idProducto);
        return ResponseEntity.ok(producto);
    }

    // Eliminamos un producto
    @DeleteMapping("productos/eliminar/{idProducto}")
    public String eliminarProducto(@PathVariable Long idProducto) {
        proServ.elminarProducto(idProducto);
        return "Producto eliminado con exito ";
    }

    // Editamos un producto

    @PutMapping("productos/editar")
    public Producto editarProducto(@RequestBody Producto producto) {
        proServ.editarProducto(producto);
        return proServ.buscarProducto(producto.getIdProducto());

    }

    @GetMapping("productos/stockBajo")
    public List<Producto> stockBajo() {
        return proServ.stockBajo();
    }


}
