package test;

import java.io.*;

import java.util.logging.Level;
import java.util.logging.Logger;

public class PruebaArchivos {

    public static void main(String[] args) {
        // Crear arreglo de nombres
        String[] nombres = {"Volvo", "BMW", "Porsche", "Mazda", "Tesla"};
        // Crear Archivo
        var nombreArchivo ="MauricioJimenez.txt";
        crearArchivo(nombreArchivo);
        
        // Escribir Archivo
        escribirArchivo(nombreArchivo,nombres);       
        leerArchivo(nombreArchivo);
       
    }

    public static void crearArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            System.out.println("Archivo " + nombreArchivo + "creado con éxito");
        } catch (FileNotFoundException ex) {
            System.out.println(ex.toString());
        }
    }

    public static void escribirArchivo(String nombreArchivo, String[] contenido) {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida = new PrintWriter(archivo);
            for(int i=0; i < contenido.length; i++) {
                salida.println(contenido[i]);
            }
            salida.close();
            System.out.println("Se escribió el arreglo en el archivo");
        } catch (FileNotFoundException ex) {
            System.out.println(ex.toString());
        }
    }
    
    public static void leerArchivo(String nombreArchivo){
       var archivo = new File(nombreArchivo);
        try {
            var entrada = new BufferedReader(new FileReader(archivo));
            var lectura = entrada.readLine();
            while(lectura != null){
                System.out.println("lectura = " + lectura);
                lectura = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

}
