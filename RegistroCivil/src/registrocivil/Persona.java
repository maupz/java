/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registrocivil;

import java.util.Random;

/**
 *
 * @author Mauricio Jimenez
 */
public class Persona {
    
    // Atributos
    private String nombre = "";
    private int edad = 0;
    private int cedula;
    private char sexo = 'H';
    private double peso = 1;
    private double altura = 1;

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
    public Persona(String nombre, int edad, char sexo, int cedula, double peso, double altura) {
        System.out.println("Ejecutando constructor con argumentos");
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.cedula = cedula;
        this.peso = peso;
        this.altura = altura;
    }

    // Metodos
    
    //toString(): devuelve toda la información del objeto.
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", cedula=" + cedula + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }
    
    // generaCedula(): Genera un número aleatorio de 9 cifras.
    public static int generaCedula(){
        Random random = new Random();
        return random.nextInt(999999999 - 100000000) + 100000000;
    }
    
    // comprobarSexo(char sexo): comprueba que el sexo introducido es correcto. Si no es correcto, será H.
    public static char comprobarSexo(char sexo) {
        if (sexo == 'H' || sexo == 'M') {
            System.out.println("El sexo es correcto: " + sexo);
            return sexo;
        } else {
            System.out.println("El sexo es incorrecto. Se asignará el valor H");
            return 'H';
        }
    }
    
    // esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.
    public boolean esMayorDeEdad() {
        if (this.getEdad() >= 18) {
            System.out.println("Sí es mayor de edad: " + Integer.toString(this.getEdad()));
            return true;
        } else {
            System.out.println("No es mayor de edad: " + Integer.toString(this.getEdad()));
            return false;
        }
    }
    
    // calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2)  en m)) 
    //   ejemplo 90/(1.82)2=27.17, si esta fórmula devuelve un valor menor que 20, la función devuelve un -1 
    //   significa que está por debajo de su peso ideal , 
    //   si devuelve un número entre 20 y 25 (incluidos) significa que está en su peso ideal y la función devuelve un 0  
    //   y si devuelve un valor mayor que 25 significa que tiene sobrepeso, la función devuelve un 1.
    public int calcularIMC(){
        double IMC;
        IMC = this.getPeso() / (this.getAltura() * this.getAltura());
        if (IMC < 20) {
            System.out.println("Se encuentra por debajo del peso ideal. IMC = " + IMC);
            return -1;
        } else if (IMC >= 20 && IMC <= 25){
            System.out.println("Se encuentra en el peso ideal. IMC = " + IMC);
            return 0;
        } else {
            System.out.println("Se encuentra con sobrepeso. IMC = " + IMC);
            return 1;
        }
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
        char s = Persona.comprobarSexo(sexo);
        this.sexo = s;
    } 

    /**
     * Get the value of cedula
     *
     * @return the value of cedula
     */
    public int getCedula() {
        return cedula;
    }

    /**
     * Set the value of cedula
     *
     * @param cedula new value of cedula
     */
    public void setCedula(int cedula) {
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
