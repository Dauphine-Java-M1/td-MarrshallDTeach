package fr.dauphine.ja.mouhoubiabdelouheb.shapes;

public class Ring {
	
	 private Circle cercleInterne;
	 private Circle cercleExterne;
	
	public Ring() {
		
	}
	
public Ring(Circle ce, Circle ci) {
		if (ce.rayon>ci.rayon) {
			ci.setCenter(ce.getCenter());
			this.cercleExterne=ce;
			this.cercleInterne=ci;	
		}
		else
		{
			ce.setCenter(ci.getCenter());
			this.cercleExterne=ci;
			this.cercleInterne=ce;	
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
	return true;
}



	public static void main(String[] args) {
		Ring r=new Ring(new Circle(new Point(6,3), 7),new Circle(new Point(3,3), 5));
		
		System.out.println(r);
		

	}

}
