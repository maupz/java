/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author mauricio.jimenez
 */
public class UsoCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.Marca = "Nintendo";
        carro1.Modelo = "Mario Kart";
        carro1.a_n = 2018;
        carro1.kilometraje = 1000;   
        
        carro1.desplegarInfo();
        
        Carro carro2 = new Carro();
        carro2.Marca = "Porsche";
        carro2.Modelo = "Cayman";
        carro2.a_n = 2014;
        //carro2.kilometraje = 500;   
        
        carro2.desplegarInfo();
    }
}
