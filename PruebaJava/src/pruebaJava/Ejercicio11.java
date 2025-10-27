package pruebaJava;

public class Ejercicio11 {

	public static int nota1;
	public static int nota2;
	
	public static void main(String[] args) {
		
		nota1 = Integer.parseInt(IO.readln("Dime la primera nota: "));
		nota2 = Integer.parseInt(IO.readln("Dime la segunda nota: "));
		
		float media = (float) (nota1 + nota2)/2;
		
		IO.println("La nota media de " + nota1 + " y " + nota2 + " = " + media);
		
	}

}
