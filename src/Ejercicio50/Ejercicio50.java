
package Ejercicio50;

import java.util.Scanner;

public class Ejercicio50 {
   public static void main(String[] args) {   
       Scanner s= new Scanner (System.in);
       int puntos = 0;
    String respuesta;
    
   
    System.out.println("1. ¿Cuanto es 5+9*4?");
    System.out.println("a) 56\nb) 38\nc) 40"); 
  
   respuesta=s.next();
    if (respuesta.equals("b")) {
      puntos++;
    }

    System.out.println("2. ¿Cual es la derivada de una constante?");
    System.out.println("a) 1\nb) 0\nc) Constante"); 

    respuesta = System.console().readLine();  
    if (respuesta.equals("b")) {
      puntos++;
    }

    System.out.println("3. Un numero elevado a la 0 es igual a: ");
    System.out.println("a) 1\nb) 0\nc) El numero"); 
  
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
      puntos++;
    }
    
    System.out.println("4. ¿Cual es el sistema de codigo abierto?");
    System.out.println("a) Windows\nb) Linux\nc) iOS"); 
  
    respuesta = System.console().readLine();
    if (respuesta.equals("b")) {
      puntos++;
    }
    System.out.println("5. ¿Cuanto años tiene una decada?");
    System.out.println("a) 10\nb) 100\nc) 200"); 
  
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
      puntos++;
    }
    
    System.out.println("6. ¿Cuál de las siguientes memorias es volátil?");
    System.out.println("a) RAM\nb) EPROM\nc) ROM"); 
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
      puntos++;
    }
    System.out.println("7. ¿Quien dijo TODO LO QUE SE ES QUE NO SE NADA");
    System.out.println("a) Platon\nb) Aristoteles\nc) Socrates"); 
  
    respuesta = System.console().readLine();
    if (respuesta.equals("c")) {
      puntos++;
    }
    System.out.println("8. ¿Cuanto es 3+3-3?");
    System.out.println("a) 9\nb) 6\nc) 3"); 
  
    respuesta = System.console().readLine();
    if (respuesta.equals("c")) {
      puntos++;
    }
    System.out.println("9. ¿Que tipo de datos se usa para numeros enteros?");
    System.out.println("a) int\nb) String\nc) float"); 
  
    respuesta = System.console().readLine();
    if (respuesta.equals("a")) {
      puntos++;
    }
    System.out.println("10. ¿Que tipo de dato se usa para cadenas?");
    System.out.println("a) int\nb) String\nc) float"); 
  
    respuesta = System.console().readLine();
    if (respuesta.equals("b")) {
      puntos++;
    }

    System.out.println("\n Usted obtuvo" + puntos + " respuestas correctas.");
   }  
}
