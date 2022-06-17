/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Asignatura;
import Servicio.AsignaturaServicio;
import java.util.List;

/**
 *
 * @author Asus
 */
public class AsignaturaControl {
     private final AsignaturaServicio asignaturaServicio = new AsignaturaServicio();
    
    public Asignatura crear(String [] args){
        var asignatura= new Asignatura(Integer.valueOf(args[0]), args[21], args[2],args[3]);
        this.asignaturaServicio.crear(asignatura);
        return asignatura;
    }
    
    public List<Asignatura> listar(){
        return this.asignaturaServicio.listar();
}
}
