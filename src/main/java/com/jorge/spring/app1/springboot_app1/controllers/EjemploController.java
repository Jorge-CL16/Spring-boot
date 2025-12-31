package com.jorge.spring.app1.springboot_app1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.jorge.spring.app1.springboot_app1.models.Empleado;
import java.util.List;
import java.util.Arrays;

@Controller
public class EjemploController {

    @GetMapping("/detalles_info")
    
    public String info(Model model) {

        Empleado empleado1 = new Empleado("Jorge", "Diaz", "Cakke 123", 
                                            "Developer", 21, 123456789, 1);

        model.addAttribute("empleado", empleado1);

        return "detalles_info";
    }

    @ModelAttribute("Empleados")
    public List<Empleado> ListaEmpleados(){
        return  Arrays.asList(
            new Empleado("Cristiano", "Ronaldo", "Cakke 123", 
            "Developer", 21, 123456789, 2),

            new Empleado("Lionel", "Messi", "Av. Central 456",
            "Team Lead", 24, 987654321, 1),

            new Empleado("Neymar", "Jr", "Calle Brasil 789",
                "Frontend Developer", 22, 555123456, 3),

            new Empleado("Kylian", "Mbappé", "Rue Paris 101",
                "Backend Developer", 23, 444987654, 2),

            new Empleado("Kevin", "De Bruyne", "Main Street 202",
                "Architect", 28, 333222111, 4),

            new Empleado("Erling", "Haaland", "Nordic Ave 303",
                "QA Engineer", 25, 666777888, 3)
        );
    }
}