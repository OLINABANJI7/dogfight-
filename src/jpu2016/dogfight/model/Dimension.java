package jpu2016.dogfight.model;

public class Dimension {
	
	private int width;
	private int heigth;

	public Dimension (int width, int heigth) {
		this.width = width;
		this.heigth = heigth;
	}
	
	public Dimension (Dimension dimension) {
		
	}

	public int getWidth () {
		return width;
	}

	public void setWidth (int width) {
		this.width = width;
	}

	public int getHeigth () {
		return heigth;
	}

	public void setHeigth (int heigth) {
		this.heigth = heigth;
	}
	
	

}
