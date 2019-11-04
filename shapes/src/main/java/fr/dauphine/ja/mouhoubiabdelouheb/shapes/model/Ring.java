package fr.dauphine.ja.mouhoubiabdelouheb.shapes.model;

import java.util.ArrayList;
import java.util.Iterator;

import fr.dauphine.ja.mouhoubiabdelouheb.shapes.view.Drawer;
import fr.dauphine.ja.mouhoubiabdelouheb.shapes.view.RingDrawer;

public class Ring extends Shapes{
	 private Circle cercleInterne;
	 private Circle cercleExterne;
	
	public Ring() {
		super.setDrawer(new RingDrawer(this));
	}
	
public Ring(Circle ce, Circle ci) {
		super.setDrawer(new RingDrawer(this));
		if (ce.rayon>ci.rayon) {
			ci.setCenter(ce.getCenter());
			this.cercleExterne=ce;
			this.cercleInterne=ci;
			this.world.add(this);
		}
		else
		{
			ce.setCenter(ci.getCenter());
			this.cercleExterne=ci;
			this.cercleInterne=ce;
			this.world.add(this);
		}
	}

@Override
public boolean equals(Object o)
{
	if(!(o instanceof Ring)) return false;
	
	Ring r=(Ring) o;
	
	return (this.cercleExterne == r.cercleExterne && this.cercleInterne == r.cercleInterne);
}


public String toString()
{
	return "centre est :"+this.cercleExterne.getCenter()+"rayon : "+this.cercleExterne.rayon+" rayon interne :"+this.cercleInterne.rayon;
}

public boolean contains(Point p)
{
	if (this.cercleExterne.contains(p) && !this.cercleInterne.contains(p) ) {
		return true;
	}
	else
	{
		return false;
	}
}

public boolean contains(Point p, ArrayList<Ring> rigns)
{
	for (Ring ring : rigns) {
		if(ring.contains(p))
		return true;
	}
	return false;
}



	public static void main(String[] args) {
		Ring r=new Ring(new Circle(new Point(6,3), 7),new Circle(new Point(3,3), 5));
		
		System.out.println(r);
		

	}

	@Override
	public void draw() {
		
	}

}
