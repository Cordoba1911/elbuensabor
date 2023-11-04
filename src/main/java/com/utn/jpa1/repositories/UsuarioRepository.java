package com.utn.jpa1.repositories;


import com.utn.jpa1.entities.ClienteEntity;
import com.utn.jpa1.entities.Usuario;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends BaseRepository<Usuario,Long>{
    List<Usuario> findByUsernameContaining(String username);
    Page<Usuario> findByUsernameContaining(String username, Pageable pageable);
    //boolean existsByEmail(@Param("email") String email);
    @Query(value = "SELECT u FROM Usuario u WHERE u.username LIKE %:filtro%")
    List<Usuario> search(@Param("filtro") String filtro);
    @Query(value = "SELECT u FROM Usuario u WHERE u.username LIKE %:filtro%")
    Page<Usuario> search(@Param("filtro") String filtro, Pageable pageable);

    public  Usuario findByUsernameAndPassword(String username, String password);
}

