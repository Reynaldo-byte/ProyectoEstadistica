/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package presentacion;

import logica.Logica;

/**
 *
 * @author Cheetos, Calec y Alejandro
 */
public class Modelo {
    private Vista vista;
    private Logica sistema;

    public Modelo() {

    }
    
    public void iniciar(){

        getVentana().setVisible(true);
        getVentana().llenarMuestra(getLogica().getLista());
    }
    
    public Vista getVentana() {
        if(vista == null){
            vista = new Vista(this);
        }
        return vista;
    }
    
    public Logica getLogica(){
        if(sistema==null){
            sistema = new Logica();
        }
        return sistema;
    }
    
    public void enviarMedia(){
       getVentana().cambiarMedia(getLogica().calcularMedia());
    }
    
    public void enviarMediana(){
       getVentana().cambiarMediana(getLogica().calcularMediana());
     
    }
    
    public void enviarModa(){
       getVentana().cambiarModa(getLogica().calcularModa());
    }
    
    public void enviarVarianza(){
        getVentana().cambiarVarianza(getLogica().calcularVarianza());
    }
    
    public void enviarDesviacion(){
        getVentana().cambiarDesviacion(getLogica().calcularDesviacion());
    }
    
}
