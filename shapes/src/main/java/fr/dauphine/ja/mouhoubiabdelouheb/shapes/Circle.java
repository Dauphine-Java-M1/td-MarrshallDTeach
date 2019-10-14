package fr.dauphine.ja.mouhoubiabdelouheb.shapes;

import java.util.ArrayList;

public class Circle {
	
	private Point center;
	private int rayon;
	
	public Circle(Point p, int r) {
		this.center=p;
		this.rayon=r;
	}
	
	public void translate(int dx, int dy)
	{
		Point temp=new Point(center);
		temp.translate(dx, dy);
		center=temp;
	}
	
	public String toString()
	{
		
		return "le centre du point est: "+this.center+"rayon = "+this.rayon+"Son aire est :"+this.surface() ;
	}
	
	public Point getCenter()
	{
		Point temp=new Point(this.center);
		return temp;
	}
	
	public double surface()
	{
		return (this.rayon*this.rayon)*Math.PI;
	}
	
	public boolean contains(Point p)
	{
		double distance=Math.sqrt(((p.getX()-this.center.getX())*(p.getY()-this.center.getY())+((p.getY()-this.center.getY()))));
		if(distance<=this.rayon)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static boolean containes(Point p, ArrayList<Circle> liste)
	{
		for (Circle c : liste) {
			if (c.contains(p)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Point p=new Point(1,2);
		Circle c=new Circle(p,1);
		Circle c2=new Circle(p,2);
		c2.translate(1,1);
		System.out.println(c+" "+c2);

	}

}
