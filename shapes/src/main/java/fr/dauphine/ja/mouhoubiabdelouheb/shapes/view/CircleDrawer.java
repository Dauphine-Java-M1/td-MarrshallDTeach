package fr.dauphine.ja.mouhoubiabdelouheb.shapes.view;

import java.awt.Graphics;

import fr.dauphine.ja.mouhoubiabdelouheb.shapes.model.Circle;

public class CircleDrawer implements Drawer{
	
	
	private Circle circle;
	
	public CircleDrawer(Circle c) {
		circle=c;
	}
	
	public void draw(Graphics g) {
		g.drawOval(circle.getCenter().getX(),circle.getCenter().getY() , circle.getRayon(), circle.getRayon());
	}

}
