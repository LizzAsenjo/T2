/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Liz
 */
public class Cursos {

    private String trigonometría;
    private String geometría;
    private String algebra;
    
    public Cursos(String trigonometría, String geometría, String algebra) {
        this.trigonometría = trigonometría;
        this.geometría = geometría;
        this.algebra = algebra;
    }

    public String getAlgebra() {
        return algebra;
    }

    public void setAlgebra(String algebra) {
        this.algebra = algebra;
    }

    public String getTrigonometría() {
        return trigonometría;
    }

    public void setTrigonometría(String trigonometría) {
        this.trigonometría = trigonometría;
    }

    public String getGeometría() {
        return geometría;
    }

    public void setGeometría(String geometría) {
        this.geometría = geometría;
    }
    
 
}
