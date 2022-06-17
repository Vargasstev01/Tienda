/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Tienda.tienda.controller;

import com.Tienda.tienda.dao.ClienteDao;
import com.Tienda.tienda.domain.cliente;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class indexController{
    @Autowired
    private ClienteDao clienteDao;
    @GetMapping("/")
    
    public String inicio(Model model){
        log.info("Ahora se usa arquitectura MVC");
       
        
        var clientes=clienteDao.findAll();
        model.addAttribute("clientes",clientes );
        return "index";
    }
}