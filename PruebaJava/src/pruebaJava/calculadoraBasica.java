package pruebaJava;

public class calculadoraBasica {
	

	public static void main(String[] args) {
		String operador;
		int num1, num2, res;
		
		operador = IO.readln("Dime el operador (+, -, *, /): ");
		num1 = Integer.parseInt(IO.readln("Dime el primer número: "));
		num2 = Integer.parseInt(IO.readln("Dime el segundo número: "));
		
		switch (operador) {
		case "+":
			res = num1+num2;
			IO.println(res);
			break;
		case "-":
			res = num1-num2;
			IO.println(res);
			break;
		case "*":
			res = num1*num2;
			IO.println(res);
			break;
		case "/":
			res = num1/num2;
			IO.println(res);
			break;
		}
		
		
	}

}
