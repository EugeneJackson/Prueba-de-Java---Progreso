package pruebaJava;

public class Ejercicio3Bucles {

	public static void main(String[] args) {
		
		int randomNum = (int)(Math.random() * 101), userInput = 0;
		
		IO.println(randomNum);
		
		IO.println("Vamos a adivinar el numero aleatorio de 0 entre 100. Si desea rendirse, escriba '-1'");
		
		while (userInput != randomNum) {
			userInput = Integer.parseInt(IO.readln("Dime un número: "));
			
			if (userInput == -1) {
				IO.println("Te has rendido.");
				break;
			}
			
			if (userInput < randomNum) {
				IO.println("El número introducido es menor que el número.");
			}
			else if (userInput > randomNum) {
				IO.println("El número introducido es mayor que el número.");
			}
			else {
				IO.println("¡Has adivinado!");
			}
			
			
		}
	}
}
