package com.utn.jpa1.services;


import com.utn.jpa1.entities.ClienteEntity;
import com.utn.jpa1.repositories.ClienteRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
public class ClienteServiceImplTest {

    @MockBean
    private ClienteRepository clienteRepository;

    @Autowired
    private ClienteServiceImpl clienteService;

    @Test
    void testSearchString() throws Exception {
        ClienteEntity cliente = new ClienteEntity();
        cliente.setNombre("Lionel");
        cliente.setApellido("Messi");

        List<ClienteEntity> listaEnviada = new ArrayList<ClienteEntity>();
        listaEnviada.add(cliente);

        when(clienteRepository.searchNative("Lionel")).thenReturn(listaEnviada);

        assertEquals(listaEnviada, clienteService.search("Messi"));

    }


}
