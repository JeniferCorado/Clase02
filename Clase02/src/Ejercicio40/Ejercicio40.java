
package Ejercicio40;

import java.util.Scanner;


public class Ejercicio40 {
     public static void main(String[] args) {   
        Scanner s= new Scanner (System.in);      

        double potencia = 1;

        
int base, exponente; 
        System.out.print("Introduzca la base de la potencia: ");
        base=s.nextInt();

        System.out.print("Introduzca el exponente de la potencia: ");
       exponente=s.nextInt();

        if (exponente == 0)
            potencia = 1;

        if (exponente > 0)
            for (int i = 0; i < exponente; i++)
                potencia *= base;

        if (exponente < 0) {
            for (int i = 0; i < -exponente; i++)
                potencia *= base;

            potencia = 1/potencia;
        } 
        
 System.out.println(base + "^" + exponente + " = " + potencia);
    

}
}
