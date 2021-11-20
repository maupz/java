/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author Mauricio Jimenez
 */
public class Electrodomestico {
    private double precioBase = 100;
    private String color = "Blanco";
    private char consumo = 'F';
    private double peso = 5;
    
    // Constructores
    public Electrodomestico() {
    }
    
    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
    }
    public Electrodomestico(double precioBase, String color, char consumo, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        comprobarColor(color);
        comprobarConsumoEnergetico(consumo);
    }
    // ComprobarConsumoEnergetico: comprueba que la letra es correcta, 
    // si no es correcta usara la letra por defecto. Se invocara al crear el objeto y no será visible.
    private void comprobarConsumoEnergetico(char consumo) {
        if (consumo == 'A' || consumo == 'B' || consumo == 'C' || consumo == 'D' || consumo == 'E' || consumo == 'F' ) {
            this.consumo = consumo;
        }
        else {
            this.consumo = 'F';
        }
    }
    // comprobarColor: comprueba que el color es correcto, sino lo es usa el color por defecto.
    // Se invocara al crear el objeto y no será visible.
    private void comprobarColor(String color) {
        switch (color) {
            case "Blanco":
            case "Negro":
            case "Rojo":
            case "Azul":
            case "Gris":
                this.color = color;
            break;
            default:
                this.color = "Blanco";            
        }                 
    }
    // precioFinal(): según el consumo energético, aumentara su precio, y según su tamaño, también.
    public double precioFinal() {
        double precioFinal = this.precioBase;
        // Aumentar precio según consumo
        switch (this.consumo) {
            case 'A' -> precioFinal = precioFinal + 100;
            case 'B' -> precioFinal = precioFinal + 80;
            case 'C' -> precioFinal = precioFinal + 60;
            case 'D' -> precioFinal = precioFinal + 50;
            case 'E' -> precioFinal = precioFinal + 30;
            case 'F' -> precioFinal = precioFinal + 10;
        }
        
        // Aumentar precio según peso
        if (this.peso >= 0 && this.peso < 20) {precioFinal = precioFinal + 10;}
        else if (this.peso >= 20 && this.peso < 50) {precioFinal = precioFinal + 50;}
        else if (this.peso >= 50 && this.peso < 80) {precioFinal = precioFinal + 80;}
        else if (this.peso >= 80) {precioFinal = precioFinal + 100;}
        
        return precioFinal;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "precioBase=" + precioBase + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso + '}';
    }
    
    // Metodos Get
    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumo() {
        return consumo;
    }

    public double getPeso() {
        return peso;
    }
    
    
}
