package pruebaArray;

public class prueba1 {

	public static char a = '+';
	public static int userNum, contVert, contHor;

	public static void main(String[] args) {
		
		userNum = Integer.parseInt(IO.readln("Dime el número de línas: "));
		
		for (contVert=0; contVert<userNum; contVert++) {
			for (contHor = 0; contHor<=userNum-contVert; contHor++) {
				IO.print(" ");
			}
				for (contHor=0; contHor<=contVert; contHor++) {
				
					IO.print(a + " ");
				}
			IO.println();
		}

	}

}
