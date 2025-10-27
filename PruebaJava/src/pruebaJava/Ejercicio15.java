package pruebaJava;

public class Ejercicio15 {

	public static char a = '+';
	public static int userNum, contVert, contHor;

	public static void main(String[] args) {
		
		userNum = Integer.parseInt(IO.readln("Dime el número de líneas: "));
		
		for (contVert=1; contVert<userNum; contVert++) {
			for (contHor = 1; contHor<=userNum-contVert; contHor++) {
				IO.print(" ");
			}
				for (contHor=1; contHor<=contVert; contHor++) {
				
					IO.print(a + " ");
				}
			IO.println();
		}
	}
}
