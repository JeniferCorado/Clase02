
package Ejercicio48;

import java.util.Scanner;

public class Ejercicio48 {
    public static void main(String[] args) {   
        Scanner s= new Scanner (System.in);

        
        System.out.println("Introduzca numeros.");
    System.out.println("Dejara de sumar hasta que la suma sea mayor a 10000");
    
    int numero;
    int suma = 0;
    int numero2 = 0;
    
    do {
      numero=s.nextInt(); 
      suma += numero;
      numero2++;
    } while (suma <= 10000);
    
    System.out.println("Ha introducido un total de " + numero2 + " números");
    System.out.println("La suma total es " + suma + ".");
    System.out.println("La media es " + suma / numero2);
    } 
}
