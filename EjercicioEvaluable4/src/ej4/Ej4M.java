package ej4;

public class Ej4M {

	public static void main(String[] args) {
		Ej4F fun = new Ej4F();
		
		int[][] rpgMap = {{1, 2, 3},
						  {4, 5, 6},
						  {7, 8,  9}};
		
		int userPos, destPos;
		
		IO.println("========Mapa========");
		
		for(int i = 0; i < rpgMap.length; i++) {
			for(int j = 0; j < rpgMap[i].length; j++) {
				IO.print(" | " + rpgMap[i][j] + " | ");
			}
			IO.println();	
		}
		
		IO.println("====================");
		
		userPos = Integer.parseInt(IO.readln("¿En que posición está el personaje en el mapa? --> "));
		destPos = Integer.parseInt(IO.readln("¿En que posición desea moverse? --> "));
		
		if(fun.rpgMap(rpgMap, userPos, destPos) == true) {
			IO.println(fun.rpgMap(rpgMap, userPos, destPos) + ", Puedes ir directamente de la posición " + userPos + " a " + destPos);
		} else {
			IO.println(fun.rpgMap(rpgMap, userPos, destPos) + ", No puedes ir directamente de la posición " + userPos + " a " + destPos);
		}
	}

}
