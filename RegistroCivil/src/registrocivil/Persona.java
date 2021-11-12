/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrocivil;

/**
 *
 * @author Mauricio Jimenez
 */
public class Persona {
    
    // Atributos
    private String nombre = "";
    private int edad = 0;
    private String cedula = "";
    private char sexo = 'H';
    private double peso = 0;
    private double altura = 0;

    // Constructor
    public Persona() {
        System.out.println("Ejecutando constructor simple");
    }
    
    // Constructor 3 Atributos
    public Persona(String nombre, int edad, char sexo) {
        System.out.println("Ejecutando constructor con argumentos");
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }
    
    // Constructor con todos los atributos
    public Persona(String nombre, int edad, char sexo, String cedula, double peso, double altura) {
        System.out.println("Ejecutando constructor con argumentos");
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.cedula = cedula;
        this.peso = peso;
        this.altura = altura;
    }

    // Metodos

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", cedula=" + cedula + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }
    
    
    
    // Sets & Gets
    /**
     * Get the value of altura
     *
     * @return the value of altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * Set the value of altura
     *
     * @param altura new value of altura
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * Get the value of peso
     *
     * @return the value of peso
     */
    public double getPeso() {
        return peso;
    }

    /**
     * Set the value of peso
     *
     * @param peso new value of peso
     */
    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * Get the value of sexo
     *
     * @return the value of sexo
     */
    public char getSexo() {
        return sexo;
    }

    /**
     * Set the value of sexo
     *
     * @param sexo new value of sexo
     */
    public void setSexo(char sexo) {
        this.sexo = sexo;
    } 

    /**
     * Get the value of cedula
     *
     * @return the value of cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * Set the value of cedula
     *
     * @param cedula new value of cedula
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    /**
     * Get the value of edad
     *
     * @return the value of edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Set the value of edad
     *
     * @param edad new value of edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    /**
     * Get the value of Nombre
     *
     * @return the value of Nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Set the value of Nombre
     *
     * @param Nombre new value of Nombre
     */
    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }

}
