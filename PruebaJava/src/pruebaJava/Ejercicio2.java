package pruebaJava;

import java.util.Scanner;

public class Ejercicio2 
{

	public static String nombre;
	
	public static void main(String[] args) 
	{
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Dime tu nombre completo: ");
			String nombre = scanner.nextLine();
			
			System.out.println("Tu nombre es: " + nombre);
		}
		catch (Exception e) {
			System.out.println("Has introducido un dato incorrecto.");
		}
	}

}
