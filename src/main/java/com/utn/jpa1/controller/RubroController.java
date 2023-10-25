package com.utn.jpa1.controller;

import com.utn.jpa1.entities.Rubro;
import com.utn.jpa1.services.RubroServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/rubros")
public class RubroController extends BaseControllerImpl<Rubro, RubroServiceImpl> {
}
