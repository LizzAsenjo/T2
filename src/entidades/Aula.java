/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Liz
 */
public class Aula {
    private String curso;
    private String estudiantes;

    public Aula(String curso, String estudiantes) {
        this.curso = curso;
        this.estudiantes = estudiantes;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(String estudiantes) {
        this.estudiantes = estudiantes;
    }
    
    
}
