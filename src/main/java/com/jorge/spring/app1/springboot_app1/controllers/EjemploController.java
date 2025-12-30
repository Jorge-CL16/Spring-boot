package com.jorge.spring.app1.springboot_app1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.jorge.spring.app1.springboot_app1.models.Empleado;





@Controller
public class EjemploController {

    @GetMapping("/detalles_info")
    
    public String info(Model model) {

        Empleado empleado1 = new Empleado("Jorge", "Diaz", "Cakke 123", 
                                            "Developer", 21, 123456789, 1);

        model.addAttribute("empleado", empleado1);

        return "detalles_info";
    }
}