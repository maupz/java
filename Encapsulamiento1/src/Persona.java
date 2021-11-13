/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mauricio Jimenez
 */
public class Persona {

    // Atributos
    private String nombre;
    private double sueldo;
    private boolean eliminado;
    
    // Set & Get
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public double getSueldo(){
        return this.sueldo;
    }
    public void setSueldo(double sueldo){
        this.sueldo = sueldo;
    }
    // Solo cuando es boolean se usa este formato isEliminado
    public boolean isEliminado(){
        return this.eliminado;
    }
    public boolean setEliminado(boolean eliminado){
        this.eliminado = eliminado;
    }
    @Override
    public String toString() {
        return "Persona nombre: " + this.nombre + 
               " Sueldo: " + this.sueldo + 
               "Eliminado: " + this.eliminado;
    }
}
