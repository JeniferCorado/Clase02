
package Ejercicio11;

import java.util.Scanner;


public class Ejercicio11 {
    public static void main(String[] args) {   
 Scanner s= new Scanner (System.in);
        final float kb=800;
       float cantidad;
            System.out.println("Ingrese la cantidad de Kb: ");
            cantidad=s.nextInt();
            
            float mb;
            mb=cantidad/kb;
            System.out.println("La cantidad convertida: "+mb+ " Mb");   
}
}