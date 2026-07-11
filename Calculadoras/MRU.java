// Hice este archivo el dia viernes 10/07/2026. 
/*  Esta es una calculadora de MRU creada originalmente el jueves 11/06/2026 en mi area de pruebas, pero lo comenté
porque aún no lo entendía del todo xd, se descomentó oficialmente el domingo 14/06/2026 y ahora está aquí en su propio archivo.
*/

import java.util.Scanner;

public class MRU {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    // vamo a alocarno :v

    // Empezamos creando un menú de opciones
    System.out.println("=== MOVIMIENTO RECTILÍNEO UNIFORME (MRU) ===");
    System.out.println("¿Qué quieres calcular?");
    System.out.println("1. Velocidad (v = d / t)");
    System.out.println("2. Distancia (d = v * t)");
    System.out.println("3. Tiempo (t = d / v)");
    System.out.print("Opción: ");
        
    // De acuerdo con la opción que elijas se ejecutará un bloque de código diferente.
    int opcion = sc.nextInt();
        
    if (opcion == 1) {
        System.out.print("Distancia recorrida (metros): ");
        double d = sc.nextDouble();
        System.out.print("Tiempo transcurrido (segundos): ");
        double t = sc.nextDouble();
        double v = d / t;
        System.out.println("Velocidad: " + v + " m/s");
    }
    else if (opcion == 2) {
        System.out.print("Velocidad (m/s): ");
        double v = sc.nextDouble();
        System.out.print("Tiempo (segundos): ");
        double t = sc.nextDouble();
        double d = v * t;
        System.out.println("Distancia recorrida: " + d + " m");
    }
    else if (opcion == 3) {
        System.out.print("Distancia recorrida (metros): ");
        double d = sc.nextDouble();
        System.out.print("Velocidad (m/s): ");
        double v = sc.nextDouble();
        double t = d / v;
        System.out.println("Tiempo: " + t + " s");
    }
    else {
        System.out.println("Opción no válida.");
    } // Si no elijes una de las opciones dadas, sólo te dará un mensaje de error y el programa terminará.

    sc.close();

    }
}
