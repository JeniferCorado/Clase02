
package Ejercicio9;

import java.util.Scanner;


public class Ejercicio9 {
    public static void main(String[] args) {   
    
   Scanner s= new Scanner (System.in);
        final double pi=3.141516;
       double altura;
       double radio;
            System.out.println("Ingrese la altura del cono en cm: ");
            altura=s.nextInt();
           System.out.println("Ingrese el radio del cono en cm: ");
            radio=s.nextInt();
          double volumen=0.333333*pi*radio*radio*altura;
            
            System.out.println("El volumen del cono: "+volumen+" cm³");
  
}
}
