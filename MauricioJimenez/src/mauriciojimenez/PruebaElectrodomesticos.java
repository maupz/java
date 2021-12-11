/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mauriciojimenez;

import dominio.Electrodomestico;
import dominio.Lavadora;
import dominio.Television;

/**
 *
 * @author Mauricio Jimenez
 */
public class PruebaElectrodomesticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear Electrodomesticos
        Electrodomestico[] electrodomesticos;
        electrodomesticos = new Electrodomestico[3];
        electrodomesticos[0] = new Electrodomestico();
        electrodomesticos[1] = new Electrodomestico(1000,"Negro",'B',10);
        electrodomesticos[2] = new Electrodomestico(2000,"Rojo",'C',20);
        
        double precioTotalElectrodomesticos = 0;
        double precioTotalLavadoras = 0;
        double precioTotalTelevisores = 0;
        
        for (int i=0; i < electrodomesticos.length; i++) {            
            System.out.println("Electrodomestico #" + i + "= " + electrodomesticos[i].toString());
            System.out.println("Electrodomestico #" + i + " Precio Final = " + electrodomesticos[i].precioFinal());
            precioTotalElectrodomesticos = precioTotalElectrodomesticos + electrodomesticos[i].precioFinal();
        }

        // Crear lavadoras
        Lavadora[] lavadoras;
        lavadoras = new Lavadora[3];
        lavadoras[0] = new Lavadora();
        lavadoras[1] = new Lavadora(100, "Azul",'D',20,5);
        lavadoras[2] = new Lavadora(200, "Gris",'E',30,40);
        
        for (int i=0; i < lavadoras.length; i++) {
            System.out.println("Lavadora #" + i + "= " + lavadoras[i].toString());
            System.out.println("Lavadora #" + i + " Precio Final = " + lavadoras[i].precioFinal());
            precioTotalLavadoras = precioTotalLavadoras + lavadoras[i].precioFinal();
        }
        
        // Crear televisores
        Television[] televisores;
        televisores = new Television[3];
        televisores[0] = new Television();
        televisores[1] = new Television(100, "Rojo", 'D',10,32,true);
        televisores[2] = new Television(200, "Amarillo", 'E',30,58,true);
        
        for (int i=0; i < televisores.length; i++) {
            System.out.println("Television #" + i + "= " + televisores[i].toString());
            System.out.println("Television #" + i + " Precio Final = " + televisores[i].precioFinal());
            precioTotalTelevisores = precioTotalTelevisores + televisores[i].precioFinal();
        }
        
        System.out.println("Precio Total Electrodomesticos: "  + precioTotalElectrodomesticos);
        System.out.println("Precio Total Lavadoras: "  + precioTotalLavadoras);
        System.out.println("Precio Total Televisores: "  + precioTotalTelevisores);
        
        double sumaTotal = precioTotalElectrodomesticos + precioTotalLavadoras + precioTotalTelevisores;
        System.out.println("Precio de todos los artículos: " + sumaTotal);
        
    }
    
}
