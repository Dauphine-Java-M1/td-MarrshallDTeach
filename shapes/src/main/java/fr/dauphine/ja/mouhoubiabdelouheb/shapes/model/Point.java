package fr.dauphine.ja.mouhoubiabdelouheb.shapes.model;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class Point 
{
	
	private int x;
	private int y;
	private static int nbrPoints;
	
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
		nbrPoints++;
	}
	
	public Point(Point p) {
		this.x=p.x;
		this.y=p.y;
		nbrPoints++;
	}
	
	public String toString()
	{
		return "("+this.x+","+this.y+")";
	}
	
	public int getX()
	{
		return this.x;
	}
	
	public int getY()
	{
		return this.y;
	}
	
	public boolean isSameAs(Point p)
	{
		if (this.x == p.x && this.y == p.y)
		{
			return true;
		} 
		else 
		{
			return false;
		}
	}
	
	@Override
	public boolean equals(Object o)
	{
		if (!(o instanceof Point)) return false;
		
		Point p =(Point) o;
		
		return this.x == p.x && this.y == p.y;
	}
	
	public void translate(int dx, int dy)
	{
		x+=dx;
		y+=dy;
	}
	
    public static void main( String[] args )
    {
    	Point p = new Point(2,3);
        System.out.println(p);
        //exo 2
        Point p1=new Point(1,2);
        Point p2=p1;
        Point p3=new Point(1,2);
        
        System.out.println(p1==p2);
        System.out.println(p1==p3);
        
        ArrayList<Point> list = new ArrayList<Point>();
        list.add(p1);
        System.out.println(list.indexOf(p2));
        System.out.println(list.indexOf(p3));
    }
}
