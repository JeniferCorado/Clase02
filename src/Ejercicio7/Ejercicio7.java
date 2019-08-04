
package Ejercicio7;

import java.util.Scanner;


public class Ejercicio7 {
    public static void main(String[] args) {   
 Scanner s= new Scanner (System.in);
        double factura;
       final double iva=0.12;
            System.out.println("Ingrese la base de la factura: ");
            factura=s.nextInt();
           
            double total=(factura*iva)+factura;
            
            System.out.println("El total a pagar es: "+total);   
}
}