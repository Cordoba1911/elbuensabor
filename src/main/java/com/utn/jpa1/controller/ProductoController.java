package com.utn.jpa1.controller;

import com.utn.jpa1.entities.ClienteEntity;
import com.utn.jpa1.entities.Producto;
import com.utn.jpa1.services.ClienteServiceImpl;
import com.utn.jpa1.services.ProductoServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/productos")
public class ProductoController extends BaseControllerImpl<Producto, ProductoServiceImpl> {
}
