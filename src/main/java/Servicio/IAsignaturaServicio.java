/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Modelo.Asignatura;
import java.util.List;

/**
 *
 * @author Asus
 */
public interface IAsignaturaServicio {
    public Asignatura crear(Asignatura asignatura);
    public Asignatura buscarCodigo(int codigoAsignatura);
    public List<Asignatura> listar();  
}
