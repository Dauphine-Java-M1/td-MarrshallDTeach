

package fr.dauphine.ja.mouhoubiabdelouheb.td00;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
/**
 * Hello world!
 *
 */
public class PrimeCollection 
{
	private ArrayList<Integer> numbers;
	private Random random=new Random();
	
	public PrimeCollection() {
		numbers=new ArrayList<Integer>();
	}
	
	public void initRandom(int n,int m)
	{
		for (int i = 0; i < n; i++) {
			int v=random.nextInt(m);
			numbers.add(v);
		}
	}
	
	private boolean isPrime(int p)
	{
		if(p<1)
		return false;
		
		for (int i = 2; i < Math.sqrt(p); i++) {
			if(p%i == 0)
				return false;
			
		}
		
		return true;
	}
	
	public void printPrimes()
	{
		for (Integer e : this.numbers) {
			if(isPrime(e))
				System.out.println(e);
		}
	}
	
	
    public static void main( String[] args )
    {
        PrimeCollection p=new PrimeCollection();
        p.initRandom(100, 1000);
        p.printPrimes();
        
    }
}
