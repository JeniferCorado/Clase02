
package Ejercicio22;

import java.util.Scanner;

public class Ejercicio22 {
  public static void main(String[] args) {    
    
         Scanner s= new Scanner (System.in);
         int hora, minutos;
    System.out.print("Programa que le dira cuantos segundos faltan para media noche\n");
    
    
    System.out.print("Ingrese la hora: ");
   hora=s.nextInt();
    
    System.out.print("Ingrese los minuto: ");
     minutos=s.nextInt();

    int segundos = (hora * 3600) + (minutos * 60);
    int segundos2 = (24 * 3600) - segundos;
            
    
    System.out.printf("Para media noche faltan: "+segundos2+" Segundos      ");
       
  }
  }  

