
package Ejercicio15;

import java.util.Scanner;

public class Ejercicio15 {
public static void main(String[] args) {   
    Scanner s= new Scanner (System.in);
       
      
        int hora;
       
       System.out.println("Ingrese la hora");
      hora=s.nextInt();
        if (hora>5 && hora <13)
        {
           System.out.println("Buenos dias"); 
        }
        else if ((hora>5 && hora <21))
                {
         System.out.println("Buenas tardes"); 
                }
        else 
                {
         System.out.println("Buenas noches"); 
            }
}

}
