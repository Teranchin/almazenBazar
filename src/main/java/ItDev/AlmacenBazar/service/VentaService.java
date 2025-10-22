package ItDev.AlmacenBazar.service;

import ItDev.AlmacenBazar.dto.ProductoDTO;
import ItDev.AlmacenBazar.dto.VentaProductoDTO;
import ItDev.AlmacenBazar.model.Producto;
import ItDev.AlmacenBazar.model.Venta;
import ItDev.AlmacenBazar.model.Cliente;
import ItDev.AlmacenBazar.repository.IProductoRepository;
import ItDev.AlmacenBazar.repository.IVentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.web.OffsetScrollPositionHandlerMethodArgumentResolver;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class VentaService implements IVentaService {

    @Autowired
    private IVentaRepository ventaRepo;
    private ProductoService proRepo;
    @Autowired
    private OffsetScrollPositionHandlerMethodArgumentResolver offsetResolver;

    @Override
    public void crearVenta(Venta venta) {
        ventaRepo.save(venta);
    }

    @Override
    public void editarVenta(Venta venta) {
        this.crearVenta(venta);
    }

    @Override
    public void eliminarVenta(Long idVenta) {
        ventaRepo.deleteById(idVenta);
    }

    @Override
    public VentaProductoDTO leerVenta(Long idVenta) {
        return null;
    }

    @Override
    public List<Venta> listarVenta() {
        return List.of();
    }

    @Override
    public VentaProductoDTO getVentaProductoDTO(Long idVenta) {
        return null;
    }


}
