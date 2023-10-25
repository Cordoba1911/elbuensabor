package com.utn.jpa1.services;

import com.utn.jpa1.entities.ClienteEntity;
import com.utn.jpa1.entities.Producto;
import com.utn.jpa1.repositories.BaseRepository;
import com.utn.jpa1.repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductoServiceImpl extends BaseServiceImpl<Producto, Long> implements ProductoService {
    @Autowired
    private final ProductoRepository productoRepository;

    public ProductoServiceImpl(BaseRepository<Producto, Long> baseRepository, ProductoRepository productoRepository){
        super(baseRepository);
        this.productoRepository = productoRepository;
    }

    @Override
    public List<Producto> search(String filtro) throws Exception {
        try{
            List<Producto> productos = ProductoRepository.findByDenominacionContaining(filtro);
            return productos;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
    @Override
    public Page<Producto> search(String filtro, Pageable pageable) throws Exception {
        try{
            Page<Producto> productos = ProductoRepository.findByDenominacionContaining(filtro, pageable);
            return productos;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }



}
