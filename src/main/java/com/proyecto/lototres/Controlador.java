/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.lototres;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Castellanos
 */

@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600 )
@RestController
@RequestMapping({"/actividad"})
public class Controlador {
    
    @Autowired
    ActividadService service;
    
    @GetMapping
    public List<Actividad>listar(){
        return service.listar();
    }
    
    
}
