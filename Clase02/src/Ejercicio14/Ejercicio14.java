
package Ejercicio14;

import java.util.Scanner;


public class Ejercicio14 {
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
             System.out.println("\nMicroeconomia");
                     break;
            case 2:  dia = "Martes\n";
            System.out.println("\nEstadistica");
                     break;
            case 3:  dia = "Miercoles\n";
            System.out.println("\nCalculo II");
                     break;
            case 4:  dia = "Jueves\n";
            System.out.println("\nFisica II");
                     break;
            case 5:  dia = "Viernes";
            System.out.println("\nMatematicas");
                     break;
            case 6:  dia = "Sabado\n";
            System.out.println("\nProgramacion II");
                     break;
            case 7:  dia = "Domingo\n";
            System.out.println("\nAlgebra"+dia);
                     break;
            default: dia = "\nDia inválido";
                     break;
        }
          System.out.println("El dia de la semana: " + dia);
         
}   
}
