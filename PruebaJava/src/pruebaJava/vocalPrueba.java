package pruebaJava;

import java.util.List;

public class vocalPrueba {

	public static void main(String[] args) {
		
		String userInput;
		List<Character> vocal = List.of('a', 'e', 'i', 'o', 'u');
		boolean espacioInput = false;
		
		do {
			userInput = IO.readln("Dime una letra: ");
			for (Character letra : userInput.toLowerCase().toCharArray()) {
				if (vocal.contains(letra)) {
					IO.println("Vocal");
				}
				else  {
					IO.println("No es vocal");
				}
			}
			
		} while (!espacioInput);
		
	}

}
