/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estadistica;

/**
 *
 * @author Hogar
 */
public class Calculos extends Estadistica {
   public double desviacion_estandar(double desv){
        return Math.sqrt(desv);
    }
    public double varianza(int N,double muestra[]){
                double prom=0;
        for(int i=0;i<N;i++){
            prom=prom+muestra[i];
        }
        prom=prom/N;
        double desv=0;
        for(int i=0;i<N;i++){
            desv=desv+Math.pow(muestra[i]-prom,2);
        }
        desv=desv/(N-1);
        return desv;

    }
}
