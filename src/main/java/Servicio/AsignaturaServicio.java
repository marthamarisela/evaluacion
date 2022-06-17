/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Modelo.Asignatura;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Asus
 */
public class AsignaturaServicio implements IAsignaturaServicio{
private static List<Asignatura> asignaturaList = new ArrayList<>();
    @Override
    public Asignatura crear(Asignatura asignatura) {
         this.asignaturaList.add(asignatura);
        return asignatura;
    }
 @Override
    public List<Asignatura> listar() {
         return this.asignaturaList;
    }
    @Override
    public Asignatura buscarCodigo(int codigoAsignatura) {
         Asignatura asignatura=null;
        for(var a:this.asignaturaList){
            if(codigoAsignatura==a.getCodigo()){
                asignatura=a;
                break;
            }
        }
        return asignatura;
    }
    }

   

    

