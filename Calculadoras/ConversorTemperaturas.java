// Hice este archivo el día jueves 09/07/2026.
// Conversor de temperaturas creado originalmente el jueves 11/06/2026.

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

    System.out.println(celsius + "°C son " + fahrenheit + "°F y " + kelvin + "K");
    // funciona :D

    // Conversores desde kelvin y desde fahrenheit agregados el viernes 10/07/2026

    // Ahora para convertir desde grados Kelvin
    System.out.print("¿Cuántos grados Kelvin quieres convertir? ");
    kelvin = sc.nextDouble(); // Acabo de entender la diferencia entre declarar y sólo asignar un nuevo valor xd
    celsius = kelvin - 273.15;
    fahrenheit = (kelvin - 273.15) * 9.0/5.0 + 32;

    System.out.println(kelvin + "K son " + fahrenheit + "°F y " + celsius + "°C");

    // Explicación, habia puesto double de nuevo antes de kelvin, porque no me acordaba que "var nombreVariable = valor" es declarar y asignar valor, todo en una línea :v

    // Ahora para convertir desde grados Fahrenheit
    System.out.print("¿Cuántos grados Fahrenheit quieres convertir? ");
    fahrenheit = sc.nextDouble(); // 
    celsius = (fahrenheit - 32) * 5.0/9.0;
    kelvin = (fahrenheit - 32) * 5.0/9.0 + 273.15;

    System.out.println(fahrenheit + "°F son " + kelvin + "K y " + celsius + "°C");
    
    sc.close();
    // esto es una buena practica jsjs

    } 
    
}
