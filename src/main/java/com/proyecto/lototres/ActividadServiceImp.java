/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.lototres;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 *
 * @author Castellanos
 */

@Service
public class ActividadServiceImp implements ActividadService{
    @Autowired
    private ActividadRepositorio actividadrepositorio;
    @Override
    public List<Actividad> listar() {
        return actividadrepositorio.findAll();
    }
}
