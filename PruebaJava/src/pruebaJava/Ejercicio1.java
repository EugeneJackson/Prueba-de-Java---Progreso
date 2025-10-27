package pruebaJava;

public class Ejercicio1 
{
	
	//Definición de variables
	public static int num1 = 144;
	public static int num2 = 999;
	
	public static void main(String[] args) 
	{
		int sum = num1 + num2;
		int res = num1 - num2;
		int mul = num1 * num2;
		float div = (float) num1 / num2;
		
		System.out.println("Vamos a ver los resultados de las operaciones con los números: " + num1 + " y " + num2);
		System.out.println("Suma: " + sum);
		System.out.println("Resta: " + res);
		System.out.println("Multiplicación: " + mul);
		System.out.println("División: " + div);
	}

}
