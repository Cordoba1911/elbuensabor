package com.utn.jpa1.services;

import com.utn.jpa1.entities.Producto;
import com.utn.jpa1.repositories.BaseRepository;
import com.utn.jpa1.repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
}
