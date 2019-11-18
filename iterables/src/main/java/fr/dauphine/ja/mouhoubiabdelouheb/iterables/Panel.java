package fr.dauphine.ja.mouhoubiabdelouheb.iterables;

import java.util.List;
import java.util.AbstractList;
import java.util.Iterator;

/**
 * Hello world!
 *
 */
public class Panel extends AbstractList<Integer>

{
	int lb;
	int ub;
	
	public Panel(int lb, int ub) {
		this.lb=lb;
		this.ub=ub;
	}
	
	public static Iterator<Integer> panel1(final int lb, final int ub)
	{
		
		return new Iterator<Integer>() {
			
			int curseur=lb;
			
			public boolean hasNext()
			{
				
				if (curseur<=ub) 
				{
					return true;
				}
				else
				{
					return false;
				}
				
			}
			
			public Integer next()
			{
				return curseur++;
			}
		};
	}
	
	public static AbstractList<Integer> panel2(final int lb, final int ub)
	{
		return new AbstractList<Integer>() {

			@Override
			public Integer get(int k) {
				
				return lb+k;
			}

			@Override
			public int size() {
				
				return ub-lb+1;
			}
			
		};
	}
	
	
	
	@Override
	public Integer get(int arg0) 
	{
		return lb+arg0;
	}

	@Override
	public int size() 
	{
		return ub-lb+1;
	}
	
	
	public static void main( String[] args )
    {
		Iterator<Integer> it=panel1(1,5);
		for(;it.hasNext();)
		System.out.println(it.next()); 
		
		
		
		for(int i:panel2(1,5))
		System.out.println(i);

	
		List<Integer> l = new Panel(3,6);
		for(int i:l)
		{System.out.println(i); //affiche 3 4 5 6
		}
		System.out.println(l.get(1));
		}
		
	}

	

	
	
	
