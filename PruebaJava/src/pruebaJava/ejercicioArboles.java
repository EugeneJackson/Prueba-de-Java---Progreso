package pruebaJava;

import java.util.PriorityQueue;
import java.util.Collections;

public class ejercicioArboles {

	public static void main(String[] args) {
		
		
		int userInput = 0;
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
		
		IO.println("===Medidas Árboles===");
		
		do {
			userInput = Integer.parseInt(IO.readln("Dime la medida del árbol en centímetros, para cancelar, proporcione '-1': "));
			maxHeap.add(userInput);
		} while (userInput != -1);
		
		IO.println("El árbol más alto mide: " + maxHeap.peek() + "cm");
	}

}