
package Ejercicio6;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {   
  Scanner s= new Scanner (System.in);
        int area;
       int numero1;
       int numero2;
            System.out.println("Ingrese la base: ");
            numero1=s.nextInt();
            System.out.println("Ingrese la altura: ");
            numero2=s.nextInt();
            
            area=(numero1*numero2)/2;
            System.out.println("El area del triangulo es: "+area);
          
}
}