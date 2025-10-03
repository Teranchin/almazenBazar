package ItDev.AlmacenBazar.service;

import ItDev.AlmacenBazar.model.Producto;
import ItDev.AlmacenBazar.repository.IProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
        List<Producto> listarPro = proRepo.findAll();
        return listarPro;
    }
}
