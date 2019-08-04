
package Ejercicio17;

import java.util.Scanner;


public class Ejercicio17 {
    public static void main(String[] args) {   
  Scanner s= new Scanner (System.in);
           final double gravedad=9.81; 
      double a;
       double t;
       
        System.out.println("Caida libre ");
      
            System.out.println("Ingrese la altura: ");
            a=s.nextInt();
           
          t=  (double) Math.sqrt((2*a)/gravedad);
            
            System.out.println("El tiempo que tarda en caer es: "+t);
}
}
