package pruebaJava;

public class Ejercicio7 {

	public static int num;
	
	public static void main(String[] args) {
		
		try {
			num = Integer.parseInt(IO.readln("Dime un número: "));
			IO.println("Tu número es: " + num);
		} catch (Exception e) {
			System.out.println("Datos incorrectos.");
		}
	}

}
