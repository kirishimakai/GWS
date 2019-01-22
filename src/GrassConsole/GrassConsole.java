package GrassConsole;
import GWS.Grass;

public class GrassConsole {

	public static void display(Grass grass) {
		for(int i=0; i<grass.nRows;i++) {
			for(int j=0;j<grass.nColumns;j++) {
				System.out.print(String.format("%.2f", grass.getGrass(i, j)));
			}
			System.out.println();
		}
		
	}
	public static void main(String[] arg) {
		Grass grass = new Grass(7,5);
		display(grass);
		for(int i=0;i<5;i++) {
		grass.Grow();
		System.out.println("/////////");
		display(grass);
		}
	}
}
