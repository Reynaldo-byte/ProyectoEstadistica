/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;
import java.io.*;
import static java.lang.Integer.parseInt;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFileChooser;

/**
 *
 * @author Cheetos, Calec y Alejandro
 */
public class Sistema {
    private ArrayList<Integer> lista;
    public Sistema() {
        lista = new ArrayList<Integer>();
        //llenarLista();
    }
    
    /**
     * Lista de datos usada para calcular valores estadisticos
     */
    public void llenarLista(){
       Scanner entrada = null;
      JFileChooser fileChooser = new JFileChooser();
        int valor = fileChooser.showOpenDialog(fileChooser);
        if (valor == JFileChooser.APPROVE_OPTION) {
            String ruta = fileChooser.getSelectedFile().getAbsolutePath();                                        
            try {
                File f = new File(ruta);
                entrada = new Scanner(f);
                while (entrada.hasNext()) {
                    lista.add(parseInt(entrada.nextLine()));
                }
            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());
            } finally {
                if (entrada != null) {
                    entrada.close();
                }
            }
        } else {
            System.out.println("No se ha seleccionado ningún fichero");
        }
    
   }
    
    public void agregarALista(String dato){
        lista.add(parseInt(dato));
    }
    
    
    public double calcularMedia(){
        double suma=0;
        for(int i=0;i<lista.size();i++){
            suma = suma + lista.get(i);
        }
        return (suma/lista.size());
    }
    
    public double calcularMediana(){
        int valor=0;
        lista.sort(null);
        if(lista.size()%2==0){
            valor = (lista.get((lista.size()-1)/2) + lista.get((lista.size())/2))/2;
        }else{
            valor = lista.get((lista.size()-1)/2);
        }
        return valor;
    }
    
    public double calcularModa(){
        int maximoNumRepeticiones= 0;
        double moda= 0;

        for(int i=0; i<lista.size(); i++){
            int numRepeticiones= 0;
            for(int j=0; j<lista.size(); j++){
                if(lista.get(i)==lista.get(j)){
                    numRepeticiones++;
                }   
                if(numRepeticiones>maximoNumRepeticiones){
                    moda= lista.get(i);
                    maximoNumRepeticiones= numRepeticiones;
                }   
            }
        }   
        return moda;
    }
    
    public double calcularVarianza(){
        int dato=0;
        int sum1=0,sum2=0;
        double varianza,size;
        size = lista.size();
        for(int i=0; i<size; i++){
            dato= lista.get(i);
            sum1 = sum1 + dato;
            sum2 = sum2 + dato*dato;
        }
        varianza = (sum2/(size-1))-( (sum1*sum1)/(size*(size-1)));
        return varianza;
    }

    public ArrayList<Integer> getLista() {
        return lista;
    }
    
    public double calcularDesviacion(){
        double valor;
        valor = Math.sqrt(calcularVarianza());
        return valor;
    }

    public void reiniciarLista() {
        lista = new ArrayList<Integer>();
    }
}
