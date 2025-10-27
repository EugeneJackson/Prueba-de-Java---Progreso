package pruebaJava;

import java.util.Scanner;

public class Ejercicio4 {
	
	public static float euro;

	public static void main(String[] args) {
		
		try(Scanner scanner = new Scanner(System.in)) {
			System.out.println("Vamos a pasar de Euro a peseta, dime la cantidad de Euros que quieras convertir: ");
			euro = scanner.nextInt();
			
			float pesetas = (float) euro * 166.386f;
			
			System.out.println(euro + "€ son " + pesetas + " pesetas");
			
		}
		

	}

}
