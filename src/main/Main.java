package main;


import presentacion.Modelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cheetos, Calec y Alejandro
 */
public class Main {
    private Modelo modelo;
    public Main() {
        modelo = new Modelo();
        modelo.iniciar();
    }

    public static void main(String[] args) {
       new Main();
    }
    
}
