package com.utn.jpa1.repositories;

import com.utn.jpa1.entities.ClienteEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClienteRepository extends BaseRepository<ClienteEntity, Long> {
    List<ClienteEntity> findByNombreContainingOrApellidoContaining(String nombre, String apellido);
    Page<ClienteEntity> findByNombreContainingOrApellidoContaining(String nombre, String apellido, Pageable pageable);
    boolean existsByEmail(@Param("email") String email);
    @Query(value = "SELECT c FROM ClienteEntity c WHERE c.nombre LIKE %:filtro% OR c.apellido LIKE %:filtro%")
    List<ClienteEntity> search(@Param("filtro") String filtro);
    @Query(value = "SELECT c FROM ClienteEntity c WHERE c.nombre LIKE %:filtro% OR c.apellido LIKE %:filtro%")
    Page<ClienteEntity> search(@Param("filtro") String filtro, Pageable pageable);

}
