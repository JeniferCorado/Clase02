
package Ejercicio19;

import java.util.Scanner;


public class Ejercicio19 {
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
        if (media < 6) {
      System.out.print("Insuficiente");
    }
    
    if ((media >= 6) && (media < 6)) {
      System.out.print("Suficiente");
    }
    
    if ((media >= 7) && (media < 7)) {
      System.out.print("Bien");
    }
    
    if ((media >= 8) && (media < 10)) {
      System.out.print("Notable");
    }
    
    if (media >= 10) {
      System.out.print("Sobresaliente");
    }   
}
}