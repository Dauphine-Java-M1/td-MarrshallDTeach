package fr.dauphine.ja.mouhoubiabdelouheb.iterables;

import java.util.*;

public class MultTest {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList();
		for (int i = 0; i < 1000000; i++) {
			al.add(i);
		}
		
		long t0= System.nanoTime();
		List<Integer> ret = Mult.mult(2, al);
		long sum = 0;

	}

}
