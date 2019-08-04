
package Ejercicio13;

import java.util.Scanner;

public class Ejercicio13 {
    public static void main(String[] args) {   
 Scanner s= new Scanner (System.in);
      double a;
       double b;
        System.out.println("Solucion ecuacion ax+b=0 ");
            System.out.println("Ingrese el valor de a: ");
            a=s.nextInt();
           System.out.println("Ingrese el valor de b: ");
            b=s.nextInt();
          double resul= (0-b)/a;
            
            System.out.println("El valor de X es: "+resul);
}
}
