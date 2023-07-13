package com.grupo2.favorswapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controlador HomeController. Al iniciar el programa lo redirige a "login.html"
 */
@Controller
public class HomeController {
    @RequestMapping("/")
    public String home(){
        return "login";
    }
}
