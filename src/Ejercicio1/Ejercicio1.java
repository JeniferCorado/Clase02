
           
package Ejercicio1;

import java.util.Scanner;


public class Ejercicio1 {
    public static void main(String[] args) {
     
         Scanner s= new Scanner (System.in);
        int numero1;
        int numero2;
            System.out.println("Ingrese numero: ");
            numero1=s.nextInt();
            System.out.println("Ingrese numero: ");
            numero2=s.nextInt();
            int multi=0;
            multi=numero1*numero2;
            System.out.println("El resultado de su multiplicacion es: "+multi);
}}
