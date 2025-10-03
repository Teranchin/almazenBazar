package ItDev.AlmacenBazar.service;

import ItDev.AlmacenBazar.model.Venta;
import ItDev.AlmacenBazar.repository.IVentaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VentaService implements IVentaService{

    @Autowired
    private IVentaRepository ventaRepo;

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
    public Venta leerVenta(Long idVenta) {
        Venta ven = ventaRepo.findById(idVenta).orElse(null);
        return ven;
    }

    @Override
    public List<Venta> listarVenta() {
        List<Venta> listVenta = ventaRepo.findAll();
        return listVenta;
    }

}
