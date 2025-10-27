package pruebaJava;

public class Ejercicio13 {

	
	public static int edad;
	public static boolean mayorEdad;
	public static void main(String[] args) {
		
		edad = Integer.parseInt(IO.readln("Dime tu edad: "));
		
		mayorEdad = (edad >= 18);
		
		if (mayorEdad == true) {
			IO.println("Eres mayor de edad.");
		}
		else {
			IO.println("No eres mayor de edad.");
		}
		
		
	}

}
