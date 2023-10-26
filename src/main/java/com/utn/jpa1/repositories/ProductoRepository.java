package com.utn.jpa1.repositories;

import com.utn.jpa1.entities.ArticuloManufacturadoEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductoRepository extends BaseRepository<ArticuloManufacturadoEntity, Long> {
     List<ArticuloManufacturadoEntity> findByDenominacionContaining(String denominacion);
     Page<ArticuloManufacturadoEntity> findByDenominacionContaining(String denominacion, Pageable pageable);

    @Query(value = "SELECT c FROM ArticuloManufacturadoEntity c WHERE c.denominacion LIKE %:filtro%")
    List<ArticuloManufacturadoEntity> search(@Param("filtro") String filtro);
    @Query(value = "SELECT c FROM ArticuloManufacturadoEntity c WHERE c.denominacion LIKE %:filtro%")
    Page<ArticuloManufacturadoEntity> search(@Param("filtro") String filtro, Pageable pageable);
}
