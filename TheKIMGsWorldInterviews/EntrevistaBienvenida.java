// Hice este archivo el dia domingo 05/07/2026. 
// Esta es una pequeña entrevista que creé el originalmente jueves 11/06/2026 con Scanner.

import java.util.Scanner;

public class EntrevistaBienvenida {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
     // A continuacion una pequeña prueba con Scanner, como si fuera un cuestionario-dialogo de bienvenida en un videojuego jsjs
    System.out.println("what´s your name?");
    String nombre1 = sc.nextLine();

    System.out.println("Where are you from?");
    String lugar1 = sc.nextLine();

    System.out.println("what´s your favorite food?");
    String comida1 = sc.nextLine();
    
    // Despues de la entrevista, imrpimimos el saludo personalizado :v
    System.out.println("¡Welcome to the KIMG´s world " + nombre1 + "!");
    System.out.println("This isn't " + lugar1 + ", but you'll still find food as good as " + comida1 + ", or at least I hope so xd");
    sc.close();

    
    }
}
