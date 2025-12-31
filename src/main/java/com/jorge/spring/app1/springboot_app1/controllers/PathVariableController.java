package com.jorge.spring.app1.springboot_app1.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.jorge.spring.app1.springboot_app1.models.Empleado;
import java.util.Map;

@RestController
@RequestMapping("/api/variable")
public class PathVariableController {



    @Value("${config.usuario}")
    private String usuario;

    @Value("${config.codigo}")
    private int codigo;

    @Value("${config.mensaje}")
    private String mensaje;

    @Value("${config.valores}")
    private String[] valores;


    @GetMapping("/pagina1/{mensaje}")
    public ParametroDTO pagina1(@PathVariable String mensaje){

        ParametroDTO parametro1 = new ParametroDTO();
        parametro1.setInformacion(mensaje);
        return parametro1;
    }

    @PostMapping("/solicitud")
    public Empleado creaEmple(@RequestBody Empleado empleado1){


        return empleado1;
    }
    
    @GetMapping("/valores")
    public Map<String,Object> values() {
        
        Map<String, Object> json = new HashMap<>();
        json.put("usuario",usuario);
        json.put("codigo",codigo);
        json.put("mensaje",mensaje);
        json.put("valores", valores);

        return json;   
    }
    
    
}