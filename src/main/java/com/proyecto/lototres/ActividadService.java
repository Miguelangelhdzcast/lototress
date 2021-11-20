/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.lototres;

import java.util.List;
import org.springframework.stereotype.Service;

/**
 *
 * @author Castellanos
 */
@Service

public interface ActividadService{
    List<Actividad>listar();
    Actividad listarId(int id_act);
    Actividad agregar(Actividad a);
    Actividad editar(Actividad a);
    Actividad eliminar(int id_act);
}



