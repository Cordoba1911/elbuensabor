package com.utn.jpa1.repositories;

import com.utn.jpa1.entities.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepositorio extends JpaRepository <Pedido, Long> {
}
