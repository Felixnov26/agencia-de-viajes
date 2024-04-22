package com.agenciadeviajes.controllers;

import com.agenciadeviajes.model.Cliente;
import com.agenciadeviajes.model.Destino;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

public class DestinoController {
    @RequestMapping("/lista")
    public String Lista(Model modelo){
        Destino d1 = new Destino();
        d1.setCiudad("jay");


        List<Destino> cliente= Arrays.asList(d1);
        modelo.addAttribute("cliente", cliente);
        return "lista";
}
