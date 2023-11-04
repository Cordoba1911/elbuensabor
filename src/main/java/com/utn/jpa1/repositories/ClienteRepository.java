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
    @Query(value = "SELECT c FROM ClienteEntity c WHERE c.nombre LIKE %:filtro% OR c.apellido LIKE %:filtro%" )
    Page<ClienteEntity> search(@Param("filtro") String filtro, Pageable pageable);
    //QUERy nativo
    @Query(
            value = "SELECT * FROM cliente WHERE cliente.nombre LIKE %:filtro% OR cliente.apellido LIKE %:filtro% ",
            nativeQuery = true
    )
    List<ClienteEntity> searchNativo(@Param("filtro") String filtro);

    @Query(
            value = "SELECT * FROM cliente WHERE cliente.nombre LIKE %:filtro% OR cliente.apellido LIKE %:filtro% ",
            countQuery = "SELECT count(*) FROM cliente",
            nativeQuery = true
    )
    Page<ClienteEntity> searchNativoPaged(@Param("filtro") String filtro, Pageable pageable);

    @Query(
            value="SELECT count(*) FROM Pedido p  WHERE p.ID_CLIENTE like %:clienteId% AND p.FECHA_PEDIDO BETWEEN %:date1% AND %:date2%",
            nativeQuery = true
    )
    Integer searchClienteRanking( long clienteId,String date1, String date2);


}
