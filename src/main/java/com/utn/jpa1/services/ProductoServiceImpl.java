package com.utn.jpa1.services;

import com.utn.jpa1.entities.ArticuloManufacturadoEntity;
import com.utn.jpa1.repositories.BaseRepository;
import com.utn.jpa1.repositories.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductoServiceImpl extends BaseServiceImpl<ArticuloManufacturadoEntity, Long> implements ProductoService {
    @Autowired
    private final ProductoRepository productoRepository;

    public ProductoServiceImpl(BaseRepository<ArticuloManufacturadoEntity, Long> baseRepository, ProductoRepository productoRepository){
        super(baseRepository);
        this.productoRepository = productoRepository;
    }

    @Override
    public List<ArticuloManufacturadoEntity> search(String filtro) throws Exception {
        try{
            List<ArticuloManufacturadoEntity> articuloManufacturadoEntities = productoRepository.findByDenominacionContaining(filtro);
            return articuloManufacturadoEntities;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }
    @Override
    public Page<ArticuloManufacturadoEntity> search(String filtro, Pageable pageable) throws Exception {
        try{
            Page<ArticuloManufacturadoEntity> productos = productoRepository.findByDenominacionContaining(filtro, pageable);
            return productos;
        } catch (Exception e){
            throw new Exception(e.getMessage());
        }
    }



}
