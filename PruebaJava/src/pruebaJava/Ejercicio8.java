package pruebaJava;

public class Ejercicio8 {

	public static int año;
	
	public static void main(String[] args) {
		
		año = Integer.parseInt(IO.readln("Dime tu edad: "));
		
		año++;
		
		IO.println("Tu edad el año que viene será: " + año);
		
	}

}
