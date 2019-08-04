
package Ejercicio18;

import java.util.Scanner;


public class Ejercicio18 {
 public static void main(String[] args) {   
      Scanner s= new Scanner (System.in);
       
      
        double nota1;
      double nota2;
       double nota3;
       double media; 
       System.out.println("Ingrese la nota:");
      nota1=s.nextInt();
      System.out.println("Ingrese la nota:");
      nota2=s.nextInt();
      System.out.println("Ingrese la nota:");
      nota3=s.nextInt();
        media= (nota1+nota2+nota3)/3;
         System.out.println("La media es: "+ media); 
 }   
}
