
package Ejercicio12;

import java.util.Scanner;


public class Ejercicio12 {
  public static void main(String[] args) {   
      Scanner s= new Scanner (System.in);
 
       int cantidad;
       int salario=0;
      int horast=0; 
            System.out.println("Ingrese la cantidad de horas trabajadas a la semana: ");
            cantidad=s.nextInt();
            
            if(cantidad<41)
            {salario=cantidad*12;
            System.out.println("Su salario es de: "+salario+ " Euros");
            }
            else
            {
                 horast=cantidad-40;
                 salario=horast*16+480;
            System.out.println("Su salario es de: "+salario +" Euros");
            }
  }  
}
