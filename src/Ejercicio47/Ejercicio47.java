
package Ejercicio47;

import java.util.Scanner;

public class Ejercicio47 {
    public static void main(String[] args) {   
        Scanner s= new Scanner (System.in);
        
        System.out.println("Introduzca numeros enteros.");
    System.out.println("Puede finalizar introduciendo un numero negativo.");

    int numero;
    int numeroDeElementos = 0;
    int sumaImpares = 0;
    int numeroDeElementosImpares = 0;
    int maximoPar = 0;
    
    do {
     
      numero=s.nextInt(); 
      if (numero >= 0) {
        numeroDeElementos++;
        if ((numero % 2) == 1) { 
          sumaImpares += numero;
          numeroDeElementosImpares++;
        } else { // número par
          if (numero > maximoPar)
            maximoPar = numero;
        }
      }
    } while (numero >= 0);

    System.out.println("Ha introducido " + numeroDeElementos + " números");
    System.out.println("La media de los impares es " + sumaImpares/numeroDeElementosImpares);
    System.out.println("El máximo de los pares es " + maximoPar);
    System.out.print("Números primos de 2 al 100 son: ");

    boolean esPrimo = true;

    for (int n = 2; n <= 100; n++) {

     
      esPrimo = true;
      for (int i = 2; i < n; i++) {
        if (n % i == 0) {
          esPrimo = false;
        }
      }

      
      if (esPrimo) {
        System.out.print(n + " ");
      }
    }
    System.out.println();
    } 
}
