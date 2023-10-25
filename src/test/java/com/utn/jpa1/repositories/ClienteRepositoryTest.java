package com.utn.jpa1.repositories;

import com.utn.jpa1.entities.ClienteEntity;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
public class ClienteRepositoryTest {

    @Autowired
    private EntityManager entityManager;
    @Autowired
    private ClienteRepository clienteRepository;

    @Test
    void testSearchString() {
        ClienteEntity cliente = new ClienteEntity();
        cliente.setNombre("Lionel");
        cliente.setApellido("Messi");

        List<ClienteEntity> listaEnviada = new ArrayList();
        listaEnviada.add(cliente);

        entityManager.persist(cliente);
        entityManager.flush();

        assertEquals(listaEnviada, clienteRepository.searchNative("Lionel"));
        assertEquals(listaEnviada, clienteRepository.searchNative("Messi"));

    }

}
