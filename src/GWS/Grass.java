package GWS;

import java.util.Random;

public class Grass {
	public int nColumns;
	public int nRows;
	private double [][] Cells;
	private Random rand;
	private static double MAX_GROWING_SPEED=0.1;
	public Grass(int nColumns,int nRows) {
		super();
		// TODO Auto-generated constructor stub
		this.nColumns=nColumns;
		this.nRows=nRows;
		this.rand=new Random();
		this.Cells=new double [nRows][nColumns];
		for(int i=0;i<nRows;i++) {
			for(int j=0;j<nColumns;j++) {
				Cells[i][j]=rand.nextDouble();
			}
		}
	}
	public double getGrass(int i,int j) {
		return Cells[i][j];
	}
	public void Grow() {
		Random rand= new Random();
		for(int i=0;i<nRows;i++) {
			for(int j=0;j<nColumns;j++) {
				Cells[i][j]+= rand.nextDouble()*MAX_GROWING_SPEED;
				// if(Cells[i][j]>1) Cells[i][j]=1;
				Cells[i][j]=(Cells[i][j]>1) ? 1:Cells[i][j];
			}
		}
	}
	public static void main(String[] arg) {
		
	}
}
