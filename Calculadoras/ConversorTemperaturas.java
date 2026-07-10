// Hice este archivo el día jueves 09/07/2026.
// Conversor creado originalmente el jueves 11/06/2026.

import java.util.Scanner;
public class ConversorTemperaturas {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    // Ahora un conversor de temperaturas :D
    // Desde grados Celsius jsjs
    System.out.print("¿Cuántos grados Celsius quieres convertir? ");
    double celsius = sc.nextDouble();  // nextDouble() lee números con decimal

    double fahrenheit = (celsius * 9.0/5.0) + 32;
    double kelvin = celsius + 273.15;

    System.out.println(celsius + "°C son " + fahrenheit + "°F y " + kelvin + "°K");
    // funciona :D

    sc.close();
    // esto es una buena practica jsjs

    } //Agregué conversor de temperaturas (para el commit)
    
}
