package com.utn.jpa1.repositories;

import com.utn.jpa1.entities.ClienteEntity;
import com.utn.jpa1.entities.Producto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

import java.util.List;

@Repository
public interface ProductoRepository extends BaseRepository<Producto, Long> {
     List<Producto> findByDenominacionContaining(String denominacion);
     Page<Producto> findByDenominacionContaining(String denominacion, Pageable pageable);

    @Query(value = "SELECT c FROM Producto c WHERE c.denominacion LIKE %:filtro%")
    List<Producto> search(@Param("filtro") String filtro);
    @Query(value = "SELECT c FROM Producto c WHERE c.denominacion LIKE %:filtro%")
    Page<Producto> search(@Param("filtro") String filtro, Pageable pageable);
}
