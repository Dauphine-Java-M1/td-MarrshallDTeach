package fr.dauphine.ja.mouhoubiabdelouheb.shapes.model;

import fr.dauphine.ja.mouhoubiabdelouheb.shapes.view.Drawer;

public abstract class Shapes {
	
	protected Drawer drawer;
	protected World world=new World();
	
	public void setDrawer(Drawer d) {
		this.drawer=d;
	}
	
	public Drawer getDrawer()
	{
		return this.drawer;
	}
	
	public abstract void draw();
}
