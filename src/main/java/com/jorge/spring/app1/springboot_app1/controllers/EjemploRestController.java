package com.jorge.spring.app1.springboot_app1.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jorge.spring.app1.springboot_app1.models.Empleado;
import com.jorge.spring.app1.springboot_app1.models.dto.ClaseDTO;



@RestController
@RequestMapping("/api")


public class EjemploRestController {

    @GetMapping(path = "/detalles_info2")

    public ClaseDTO detalles_info2() {

        /* 
        Empleado empleado1 = new Empleado("Jorge", "Diaz", "Cakke 123", 
        "Developer", 21, 123456789, 1);

        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("Empleado", "Datos empleado");
        respuesta.put("Información", empleado1);*/
  

        ClaseDTO usuario1 = new ClaseDTO();
        usuario1.setTitulo("Administrador");
        usuario1.setUsuario("Jorge");



        return usuario1;
    }
}