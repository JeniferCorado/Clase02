
package Ejercicio16;

import java.util.Scanner;


public class Ejercicio16 {
    public static void main(String[] args) {   
 Scanner s= new Scanner (System.in);
       
        String dia="";
        int semana;
       System.out.println("1. Lunes");
       System.out.println("2. Martes");
       System.out.println("3. Miercoles");
       System.out.println("4. Jueves");
       System.out.println("5. Viernes");
       System.out.println("6. Sabado");
       System.out.println("7. Domingo");
       System.out.println("INGRESE UNA OPCION");
      semana=s.nextInt();
        switch (semana) 
        {
            case 1:  dia = "Lunes\n";
             
                     break;
            case 2:  dia = "Martes\n";
            
                     break;
            case 3:  dia = "Miercoles\n";
           
                     break;
            case 4:  dia = "Jueves\n";
            
                     break;
            case 5:  dia = "Viernes";
            
                     break;
            case 6:  dia = "Sabado\n";
           
                     break;
            case 7:  dia = "Domingo\n";
           
                     break;
            default: dia = "\nDia inválido";
                     break;
        }
          System.out.println("El dia de la semana es: " + dia);   
}
}