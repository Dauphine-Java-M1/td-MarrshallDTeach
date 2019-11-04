package fr.dauphine.ja.mouhoubiabdelouheb.shapes.model;

import java.util.LinkedList;

import fr.dauphine.ja.mouhoubiabdelouheb.shapes.view.Drawer;
import fr.dauphine.ja.mouhoubiabdelouheb.shapes.view.LigneDrawer;

public class LigneBriseeModerne extends Shapes{
	
	private LinkedList<Point> liste;
	
	public LigneBriseeModerne() {
		super.setDrawer(new LigneDrawer(this));
		this.liste=new LinkedList<Point>();
		this.world.add(this);
	}
	
	public void add(Point p)
	{
		this.liste.add(p);
	}
	
	public int nbPoints()
	{
		return liste.size();
	}

	@Override
	public void draw() {
		//lignedrawer.draw();
		
	}
	

}
