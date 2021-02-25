/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estadistica;

import java.util.Scanner;

/**
 *
 * @author Hogar
 */
public class Estadistica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cant;
        double tam;
        Calculos e=new Calculos();
        Scanner reader = new Scanner(System.in);
        System.out.println("Digite la cantidad de muestras que posee su estudio");
        cant=reader.nextInt();
        double muestra []=new double[cant];
        for(int i=0;i<cant;i++){
            System.out.println("Digite el dato #"+i);
            muestra[i]=reader.nextInt();
    }
        System.out.println("La desviación estandar de la muestra es:"+e.varianza(cant,muestra));
        System.out.println("Y la varianza es de:"+e.desviacion_estandar(e.varianza(cant,muestra)));
    }
    
}
