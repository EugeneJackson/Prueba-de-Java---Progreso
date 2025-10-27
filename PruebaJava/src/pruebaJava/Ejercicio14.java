package pruebaJava;

public class Ejercicio14 {
	
	public static int num;
	public static boolean esPar;

	public static void main(String[] args) {
		num = Integer.parseInt(IO.readln("Dime un número: "));
		
		esPar = (num % 2 == 0);
		
		try {
			if (esPar == true) {
				IO.print("El número " + num + " es par.");
			}
			else {
				IO.println("El número " + num + " es impar");
			}
		} catch (Exception e) {
			IO.println("Has introducido un dato incorrecto.");
		}
	}

}
