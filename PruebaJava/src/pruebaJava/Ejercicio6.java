package pruebaJava;

import java.util.Scanner;

public class Ejercicio6 {
	
	public static float baseImponible;
	public final static float iva = 0.21f;

	public static void main(String[] args) {
		
		try(Scanner scanner = new Scanner(System.in)) {
			System.out.println("Dime una base Imponible");
			baseImponible = scanner.nextFloat();
			
			float res = baseImponible + (baseImponible * iva);
			
			System.out.println("El total de la factura es de: " + res);
			
			
		}
		catch (Exception e) {
			System.out.println("Has introducido un dato incorrecto.");
		}
	}
}

