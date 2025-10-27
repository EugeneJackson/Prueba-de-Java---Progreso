package pruebaJava;

public class Ejercicio12 {

	// Variables:
	public static double area, diametro, longitud, radio;
	
	public static void main(String[] args) {
		
		//Pregunta al usuario por el radio.
		radio = Float.parseFloat(IO.readln("Dime el radio de la circunferencia: "));
		
		diametro = 2*radio;
		longitud =  Math.PI * diametro;
		area = Math.PI * Math.pow(radio, 2); 
		
		IO.println("La longitud es: " + String.format("%.2f", longitud));
		IO.println("El diámetro es: " + String.format("%.2f", diametro));
		IO.println("El área es: " + String.format("%.2f", area));
		
		
	}

}
