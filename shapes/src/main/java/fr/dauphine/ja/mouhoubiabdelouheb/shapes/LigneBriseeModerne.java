package fr.dauphine.ja.mouhoubiabdelouheb.shapes;

import java.util.LinkedList;

public class LigneBriseeModerne {
	private LinkedList<Point> liste;
	
	public LigneBriseeModerne() {
		this.liste=new LinkedList<Point>();
	}
	
	public void add(Point p)
	{
		this.liste.add(p);
	}
	
	public int nbPoints()
	{
		return liste.size();
	}
	

}
