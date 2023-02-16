/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.tareas.listasenlazadas2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;

/**
 *
 * @author maupz
 */
public class ListasEnlazadas2 {

    public static void main(String[] args) {
        // Hello World
        System.out.println("App: Listas Doblemente Enlazadas");
        // Crear y editar lista
        ListaDobleEnlazada<String> lista = new ListaDobleEnlazada<>();
        lista.agregarAlFinal("elemento1");
        lista.agregarAlFinal("elemento2");
        lista.agregarAlFinal("elemento3");
        lista.agregarAlFinal("elemento4");
        System.out.println("Lista1:");
        // Visualizar lista
        lista.mostrar();
        
        System.out.println("Primer Nodo:");
        Nodo<String> primerNodo = lista.getPrimerNodo();
        System.out.println(primerNodo.getValor());
        // Crear modelo de lista:
        DefaultListModel<String> modelo = new DefaultListModel<>();
        JList<String> listaGui = new JList<>(modelo);
        
        // Agregar nodos de lista al modelo de lista para usar con JList
        for (Nodo<String> nodo = lista.getPrimerNodo(); nodo != null; nodo = nodo.getSiguiente()) {
            modelo.addElement(nodo.getValor());
        }
        
        // Crear GUI //
        // Crear boton eliminar
        JButton botonEliminar = new JButton("Eliminar");
        botonEliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int indiceSeleccionado = listaGui.getSelectedIndex();
                if (indiceSeleccionado >= 0) {
                    modelo.remove(indiceSeleccionado);
                }
            }
        });
        
        //   Crear Panel JPanel
        JPanel panel = new JPanel();
        panel.add(listaGui);
        panel.add(botonEliminar);
        
        //   Crear Marco JFrame
        JFrame marco = new JFrame("Lista doblemente enlazada");
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.add(panel);
        marco.pack();
        marco.setVisible(true);
        
        
    }
}
