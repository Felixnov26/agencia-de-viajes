package com.agenciadeviajes.controllers;

import com.agenciadeviajes.model.Cliente;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller



public class ClienteController {
    @RequestMapping("/lista")
    public String Lista(Model modelo){
        Cliente c1 = new Cliente();
        c1.setNombreCliente("jay");


        List<Cliente> cliente= Arrays.asList(c1);
        modelo.addAttribute("cliente", cliente);
        return "lista";

    }







}
