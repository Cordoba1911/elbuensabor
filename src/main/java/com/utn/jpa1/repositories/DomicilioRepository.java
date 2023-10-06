package com.utn.jpa1.repositories;

import com.utn.jpa1.entities.Domicilio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DomicilioRepository extends JpaRepository<Domicilio, Long> {
}
