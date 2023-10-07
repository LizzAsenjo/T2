/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Liz
 */
public class Asistencia {
    private String Fecha;
    private String Curso;
    private String Alumnos;
    

    public Asistencia(String Fecha, String Curso, String Alumnos) {
        this.Fecha = Fecha;
        this.Curso = Curso;
        this.Alumnos = Alumnos;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getAlumnos() {
        return Alumnos;
    }

    public void setAlumnos(String Alumnos) {
        this.Alumnos = Alumnos;
    }

    public String getCurso() {
        return Curso;
    }

    public void setCurso(String Aula) {
        this.Curso = Aula;
    }
    
}
