package pruebaJava;

import java.util.Scanner;

public class Ejercicio5 {

	public static float peseta;

	public static void main(String[] args) {
		
		try(Scanner scanner = new Scanner(System.in)) {
			System.out.println("Vamos a pasar de peseta a Euro, dime la cantidad de pesetas que quieras convertir: ");
			peseta = scanner.nextInt();
			
			float euro = (float) peseta / 166.386f;
			
			System.out.println(peseta + " pesetas son " + euro + " €");
			
		}
		catch (Exception e) {
			System.out.println("Has introducido un dato incorrecto.");
		}
		
	}

}

