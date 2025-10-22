package ItDev.AlmacenBazar.service;

import ItDev.AlmacenBazar.model.Producto;
import ItDev.AlmacenBazar.dto.ProductoDTO;
import ItDev.AlmacenBazar.repository.IProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductoService implements IProductoService {

    @Autowired
    private IProductoRepository proRepo;


    @Override
    public void crearProducto(Producto producto) {
        proRepo.save(producto);
    }

    @Override
    public void editarProducto(Producto producto) {
        this.crearProducto(producto);
    }

    @Override
    public void elminarProducto(Long idProducto) {
        proRepo.deleteById(idProducto);
    }

    @Override
    public Producto buscarProducto(Long idProducto) {
        Producto pro = proRepo.findById(idProducto).orElse(null);
        return pro;
    }

    @Override
    public List<Producto> listarProductos() {
        return proRepo.listarProd();
    }

    @Override
    public List<ProductoDTO> listarProductos2() {
        return proRepo.listarProd2();
    }

    @Override
    public List<Producto> stockBajo() {
        List<Producto> listPro = this.listarProductos();
        List<Producto> lisStockBajo = new ArrayList<Producto>();

        for (Producto pro : listPro) {
            if (pro.getCantidad_disponible() <= 30)
                lisStockBajo.add(pro);
        }
        return lisStockBajo;
    }
}
