package pruebaJava;

public class factorialSuma {

	public static int factorial = 1;
	public static int contador;
	public static int suma;
	
	public static void main(String[] args) {
		
		/*
		 * Declaración una variable temporal y usamos un IO.readln (Input y Output en la misma funcion nueva de Java 25)
		 * y no tenemos que tratar el input/output como recurso.
		 */
		int n1 = Integer.parseInt(IO.readln("Vamos a calcular la factorial de un número, para ello, proporcione uno: "));
		
			//Inicializamos un if que comprueba si el input del usuario es mayor o igual que 0.
			if (n1>=0) { 
				for (contador = 0; contador<=n1; contador++) { 
					//Va multiplicando el numero de factorial con el bucle del contador
					factorial *= contador; 
					
					//Si contador == 0, declaramos factorial como 1.
					if (contador == 0) { 
						factorial = 1;
					}
					
						IO.println(contador + "! = " + factorial);
						suma += factorial; 
					
					}
					IO.println("La suma de estos números es: " + suma);
				
		}

	}

}
