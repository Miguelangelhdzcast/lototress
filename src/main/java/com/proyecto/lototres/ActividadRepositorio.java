/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.lototres;


import java.util.List;
import org.springframework.data.repository.Repository;
import javax.persistence.Id;



/**
 *
 * @author Castellanos
 */

public interface ActividadRepositorio extends Repository <Actividad, Integer>{
      public List<Actividad>findAll();
      public  Actividad findById(int id_act);
      public  Actividad save (Actividad a);
      public void deleteById (Actividad a);
}
