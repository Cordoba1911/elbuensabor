package com.utn.jpa1.repositorios;

import com.utn.jpa1.entidades.Factura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacturaRepositorio extends JpaRepository <Factura, Long> {
}
