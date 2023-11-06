package com.utn.jpa1.controller;

import com.utn.jpa1.entities.TipoArticulo;
import com.utn.jpa1.services.TipoArticuloServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/tipoArticulos")
public class TipoArticuloController extends BaseControllerImpl<TipoArticulo, TipoArticuloServiceImpl>{

    @GetMapping("/search")
    public ResponseEntity<?> search(@RequestParam String filtro){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(servicio.search(filtro));
        } catch(Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \"" + e.getMessage() + "\"}"));
        }
    }
 //   @GetMapping("/searchPaged")
   // public ResponseEntity<?> search(@RequestParam String filtro, Pageable pageable){
     //   try{
       //     return ResponseEntity.status(HttpStatus.OK).body(servicio.search(filtro, pageable));
        //} catch(Exception e){
          //  return ResponseEntity.status(HttpStatus.NOT_FOUND).body(("{\"error\": \"" + e.getMessage() + "\"}"));
        //}
    //}
    }