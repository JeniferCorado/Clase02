
package Ejercicio10;

import java.util.Scanner;


public class Ejercicio10 {
    public static void main(String[] args) {   
        Scanner s= new Scanner (System.in);
        final int kb=800;
       int cantidad;
            System.out.println("Ingrese la cantidad de Mb: ");
            cantidad=s.nextInt();
            
            int mb;
            mb=cantidad*kb;
            System.out.println("La cantidad convertida es: "+mb+ " Kb"); 
    }
}
