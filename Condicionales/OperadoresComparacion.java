// Hice este archivo el dia viernes 10/07/2026.
/*  Este es un pequeño ejercicio con varios operadores de comparación creado originalmente el sabado 13/06/2026, 
ese mismo día estuve estudiando para el examen del IPN que hice esa misma tarde.
*/
import java.util.Scanner;

public class OperadoresComparacion {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Este codigo que sigue fue lo unico que se me ocurrio para practicar todos los operadores de comparación en un solo ejercicio xd
    // Practicamos los operadores de comparación de la declaración if (< menor que, > mayor que, != no igual a, == igual a, <= menor o igual que, >= mayor o igual que)
    System.out.println("Ingresa un numero en el lector");
    int numero = sc.nextInt();
    if (numero < 20) {
    System.out.println("numero es menor que 20");
    }
    if (numero > 5) {
    System.out.println("numero es mayor que 5");
    }
    if (numero != 7) {
    System.out.println("numero es diferente de 7");
    }
    if (numero == 7) {
    System.out.println("numero es igual a 7");
    }
    if (numero <= 10) {
    System.out.println("numero es menor o igual que 10");
    }
    if (numero >= 10) {
    System.out.println("numero es mayor o igual que 10");
    }
    
    sc.close();

    
    }
    
}
