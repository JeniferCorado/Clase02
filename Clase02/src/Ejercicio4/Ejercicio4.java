
package Ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
  public static void main(String[] args) {   
      Scanner s= new Scanner (System.in);
        int numero1;
        int numero2;
            System.out.println("Ingrese numero: ");
            numero1=s.nextInt();
            System.out.println("Ingrese numero: ");
            numero2=s.nextInt();
            int multi;
            int divi;
            int suma;
            int resta;
            multi=numero1*numero2;
            divi=numero1/numero2;
            suma=numero1+numero2;
            resta=numero1-numero2;
            System.out.println("El resultado de su suma es: "+suma);
            System.out.println("El resultado de su resta es: "+resta);
            System.out.println("El resultado de su multiplicacion es: "+multi);
            System.out.println("El resultado de su division es: "+divi);
  }  
}
