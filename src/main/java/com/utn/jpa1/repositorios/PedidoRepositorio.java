package com.utn.jpa1.repositorios;

import com.utn.jpa1.entidades.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PedidoRepositorio extends JpaRepository <Pedido, Long> {
}
