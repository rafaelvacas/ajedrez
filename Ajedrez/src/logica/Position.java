package logica;

public class Position {
	private int coordX;
	private int coordY;
	
	public int[] getPosition(){
		int position[] = {coordX,coordY};
		return position;
	}
	
	//Comprobar si la posición es válida o no.
	public void setPosition(int[] newPosition){
		coordX = newPosition[0];
		coordY = newPosition[1];
	}
}
