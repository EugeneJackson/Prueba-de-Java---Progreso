package pruebaJava;

public class Ejercicio9 {

	public static int año = 2025;
	public static int añoNac;
	
	public static void main(String[] args) {
		
		try {
			añoNac = Integer.parseInt(IO.readln("Dime tu año de nacimiento: "));
			IO.println("Tu año de nacimiento es " + añoNac + " y el año actual es " + año);
			
			int edad = año - añoNac;
			
			IO.println("Tu edad es: " + edad);
		} catch (Exception e) {
			IO.println("Dato incorrecto.");
		}
		
	}

}
