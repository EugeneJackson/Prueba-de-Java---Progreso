package pruebaJava;

import java.util.Scanner;

public class Ejercicio3 {
	
	
	
	public static String nombre;
	public static String direccion;
	public static int telefono;
	
	public static void main(String[] args) {
	
			try (Scanner scanner = new Scanner(System.in)) {
				System.out.println("Dime tu nombre: ");
				nombre = scanner.nextLine();
				
				System.out.println("Dime tu dirección: ");
				direccion = scanner.nextLine();
				
				System.out.println("Dime tu telefono: ");
				telefono = scanner.nextInt();
			}
			System.out.println();
		
		System.out.println("Tu nombre es: " + nombre);
		System.out.println("Tu dirección es: " + direccion);
		System.out.println("Tu número de telefono es: " + telefono);
	}

}
