package com.utn.jpa1.repositories;


import com.utn.jpa1.entities.Producto;
import com.utn.jpa1.entities.Rubro;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RubroRepositorio extends JpaRepository<Rubro, Long> {
    List<Rubro> findByDenominacionContaining(String denominacion);
    Page<Rubro> findByDenominacionContaining(String denominacion, Pageable pageable);

    @Query(value = "SELECT c FROM Rubro c WHERE c.denominacion LIKE %:filtro%")
    List<Rubro> search(@Param("filtro") String filtro);
    @Query(value = "SELECT c FROM Rubro c WHERE c.denominacion LIKE %:filtro%")
    Page<Rubro> search(@Param("filtro") String filtro, Pageable pageable);
}
