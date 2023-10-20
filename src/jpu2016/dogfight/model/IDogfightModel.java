package jpu2016.dogfight.model;

import java.awt.Dimension;
import java.util.ArrayList;

public interface IDogfightModel {
	
	public IArea getArea();
	
	public void buidArea(Dimension dimension);
	
	public void addMobile(IModele Mobile);
	
	public void removeMobile(IMobile Mobile);
	
	public ArrayList<IMobile> getMobiles();
	
	public IMobile getIMobileByPlayer(int player);
	
	public void setMobilesHavesMoved();

}
