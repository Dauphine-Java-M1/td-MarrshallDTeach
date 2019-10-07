package fr.dauphine.ja.mouhoubiabdelouheb.shapes;

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
	
	
    public static void main( String[] args )
    {
    	Point p = new Point(2,3);
        System.out.println(p);
    }
}
