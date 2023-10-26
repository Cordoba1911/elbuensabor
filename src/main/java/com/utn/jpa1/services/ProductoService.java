package com.utn.jpa1.services;

import com.utn.jpa1.entities.ArticuloManufacturadoEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ProductoService extends  BaseService<ArticuloManufacturadoEntity, Long> {
    List<ArticuloManufacturadoEntity> search(String filtro) throws Exception;
    Page<ArticuloManufacturadoEntity> search(String filtro, Pageable pageable) throws Exception;
}
