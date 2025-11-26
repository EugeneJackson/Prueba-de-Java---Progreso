package ej4;

public class Ej4F {

	public boolean rpgMap(int[][] mapRpg, int userPos, int destPos) {
		
		boolean comprobante = true;
		
		int indiceUser = userPos - 1;
		int rowOrigen = indiceUser / 3;
		int colOrigen = indiceUser % 3;
		
		int indiceDest = destPos - 1;
		int rowDest = indiceDest / 3;
		int colDest = indiceDest % 3;
		
		int distanciaTotal = Math.abs(rowOrigen - rowDest) + Math.abs(colOrigen - colDest);
		
		if(distanciaTotal != 1) comprobante = false;
		
		return comprobante;
	}
}
