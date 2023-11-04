package com.utn.jpa1.services;

import com.utn.jpa1.entities.Factura;
import com.utn.jpa1.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacturaServiceImpl extends BaseServiceImpl<Factura, Long> implements FacturaService {

    @Autowired
    private FacturaRepositorio facturaRepository;
    @Autowired
    private PedidoRepositorio pedidoRepository;
    @Autowired
    private ArticuloManufacturadoRepository articuloManufacturadoRepository;
    public FacturaServiceImpl(BaseRepository<Factura, Long> baseRepository) {
        super(baseRepository);
    }

    //@Override
            //public List<Factura> search(String string) throws Exception {
        //    return null;
        //}
    //
            //@Override
            //public Page<Factura> search(String string, Pageable pageable) throws Exception {
        //    return null;
        //}
}
