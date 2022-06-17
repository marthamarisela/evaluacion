/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Asus
 */
public class Asignatura {
    private int codigo;
    private String nombre;
    private String curso;
   private String nombreAlumno;

    public Asignatura(int codigo, String nombre, String curso, String nombreAlumno) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.curso = curso;
        this.nombreAlumno = nombreAlumno;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    @Override
    public String toString() {
        return "Asignatura{" + "codigo=" + codigo + ", nombre=" + nombre + ", curso=" + curso + ", nombreAlumno=" + nombreAlumno + '}';
    }

}