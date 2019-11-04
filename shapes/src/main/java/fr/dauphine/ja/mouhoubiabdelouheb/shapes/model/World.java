package fr.dauphine.ja.mouhoubiabdelouheb.shapes.model;

import java.util.ArrayList;

public class World {
	private ArrayList<Shapes> shapes;
	
	public World() {
		shapes=new ArrayList<Shapes>();
	}
	
	public void add(Shapes s)
	{
		this.shapes.add(s);
	}
	
	public ArrayList<Shapes> getShapes()
	{
		return this.shapes;
	}

}
