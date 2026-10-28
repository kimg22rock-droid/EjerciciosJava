//Hice este archivo el dia martes 27/10/2026
// Este es un ejercicio de control de acceso que creé el originalmente domingo 14/06/2026 con Scanner.

import java.util.Scanner;

public class EvergardensBar {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("¡Welcome to Evergarden´s bar!");
        System.out.println("Age?"); 
        int ageToPass = sc.nextInt();
        if(ageToPass <= 0) {
            System.out.println("Error");
        } else if(ageToPass <= 17) {
            System.out.println("Too Young");
        } else if(ageToPass < 100) {
            System.out.println("Welcome!");
        }else if(ageToPass < 200) {
            System.out.println("Really?");
        } else {
            System.out.println("Vampires and elves are not welcome!!!");
        }

            sc.close();

    }
}