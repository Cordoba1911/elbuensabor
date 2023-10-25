package com.utn.jpa1.controllers;

import com.utn.jpa1.controller.ClienteController;
import com.utn.jpa1.entities.ClienteEntity;
import com.utn.jpa1.services.ClienteServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@WebMvcTest(ClienteController.class)
public class ClienteControllerTest {

    @MockBean
    private ClienteServiceImpl personaService;

    @Autowired
    private MockMvc mockMvc;

    @Test
    void testSearchString() throws Exception {
        ClienteEntity cliente = new ClienteEntity();
        cliente.setNombre("Lionel");
        cliente.setApellido("Messi");

        List<ClienteEntity> listaEnviada = new ArrayList();
        listaEnviada.add(cliente);

        when(personaService.search("Lionel")).thenReturn(listaEnviada);

        mockMvc.perform(get("/api/v1/personas/search")
                        .param("filtro", "Lionel")
                        .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].nombre", is("Lionel")))
                .andExpect(jsonPath("$[0].apellido", is("Messi")));



    }

}
