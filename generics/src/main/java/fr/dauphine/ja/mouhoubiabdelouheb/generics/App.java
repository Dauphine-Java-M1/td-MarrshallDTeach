package fr.dauphine.ja.mouhoubiabdelouheb.generics;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
	/*public static int myMax(int a,Integer ...integers )
	{
		Arrays.sort(integers);
		
		if(a<integers[integers.length-1])
			return integers[integers.length-1];
		else
			return a;
	}*/
	
	
	public static <T extends Comparable<T>> T myMax(T o,T...Objects)
	{
		T max=o;
		for (T t : Objects) 
		{
			if(max.compareTo(t)< 0) max=t;
		}
		return max;
		
	}
	
	private static void print(List<?> list) 
	{
		for(Object o:list)
			System.out.println(o);
	}
	
	public static void length(List<? extends CharSequence> t)
	{
		
		for (CharSequence charSequence : t) {
			System.out.println(charSequence.length());
		}
		
		
	}
	
	
	
    public static void main(String[] args) {
		
    	System.out.println(myMax(15,1));
    	System.out.println(myMax("baa", "aba"));
    	System.out.println(myMax(8.6,16.64));
    	
    	
    	List<String> list=Arrays.asList("foo", "toto");
    	print(list);
    	length(list);
    	
	}
}
