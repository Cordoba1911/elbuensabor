package com.utn.jpa1.controller;

import com.utn.jpa1.entities.ClienteEntity;
import com.utn.jpa1.services.ClienteServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/clientes")
public class ClienteController extends BaseControllerImpl<ClienteEntity, ClienteServiceImpl> {
}
