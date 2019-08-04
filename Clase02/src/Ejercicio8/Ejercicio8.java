
package Ejercicio8;

import java.util.Scanner;

public class Ejercicio8 {
public static void main(String[] args) {   
     Scanner s= new Scanner (System.in);
        int salario;
       final int hora=12;
       int horas;
       int dias;
            System.out.println("Ingrese las horas trabajas al dia: ");
            horas=s.nextInt();
           System.out.println("Ingrese la cantidad de dias trabajados a la semana: ");
            dias=s.nextInt();
           
            int total= (horas*dias*hora);
            
            System.out.println("El salario semanal es: "+total+ " euros");

}    
}
