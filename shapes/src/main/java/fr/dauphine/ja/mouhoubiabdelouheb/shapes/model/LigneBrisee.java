package fr.dauphine.ja.mouhoubiabdelouheb.shapes.model;

import java.util.ArrayList;

public class LigneBrisee {
	
	private Point points[];
	private int nbrpointsCree;
	
	public LigneBrisee(int nb) 
	{
		points=new Point[nb];
		nbrpointsCree=0;
	}
	
	public void add(Point p)
	{
		if (nbrpointsCree< points.length) {
			points[nbrpointsCree]=p;
			nbrpointsCree++;
		}
		else {
			System.out.println("on a dépassé la capacité");
		}
	}
	
	public int pointCapacity()
	{
		return points.length;
	}
	
	public int nbPoints()
	{
		return nbrpointsCree;
	}
	
	public boolean contains(Point p)
	{
		for (Point point : points) {
			if (point.isSameAs(p)) {
				return true;
			}
		}
		
		return false;
	}

	public static void main(String[] args) {
		LigneBrisee l= new LigneBrisee(2);
		Point pp=new Point(2,5);
		l.add(pp);
		l.add(new Point(2, 1));
		l.add(new Point(2, 2));
		System.out.println(l.nbrpointsCree);
		System.out.println(l.contains(pp));
		//System.out.println(l.contains(null));
		

	}

}
