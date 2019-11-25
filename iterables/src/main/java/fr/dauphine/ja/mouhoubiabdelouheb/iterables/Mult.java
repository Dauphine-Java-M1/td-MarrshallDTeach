package fr.dauphine.ja.mouhoubiabdelouheb.iterables;

import java.util.AbstractSequentialList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.List;
import java.util.AbstractList;
import java.util.Iterator;

public class Mult 
{
	
	public static List<Integer> mult(final int x, final List<Integer> l)
	{
		if(l instanceof RandomAccess) {
			return new AbstractList<Integer>() {

				@Override
				public Integer get(int arg0) {
					
					return l.get(arg0);
				}

				@Override
				public int size() {
					
					return l.size();
				}
				
			};
		}
		else 
		{
		return new AbstractSequentialList<Integer>() {

			@Override
			public ListIterator<Integer> listIterator(final int arg0) {
				// TODO Auto-generated method stub
				return new ListIterator<Integer>() {
					
					private ListIterator<Integer> myList = l.listIterator(arg0);

					public void add(Integer arg0) {
						throw new UnsupportedOperationException();
					}

					public boolean hasNext() {
			
						return myList.hasNext();
					}

					public boolean hasPrevious() {
			
						return myList.hasPrevious();
					}

					public Integer next() {
	
						return myList.next()*x;
					}

					public int nextIndex() {
						
						return myList.nextIndex();
					}

					public Integer previous() {
						
						return myList.previous();
					}

					public int previousIndex() {
						
						return myList.previousIndex();
					}

					public void remove() {
						throw new UnsupportedOperationException();
						
					}

					public void set(Integer arg0) {
						throw new UnsupportedOperationException();
						
					}
				};
			}

			@Override
			public int size() {
				
				return l.size();
			}
		};
		}
	}
	
	/* mult(list l, int x) 
	 * 
	 * if(l intanceof RandomAcces)
	 * 	return new AbstractList(
	 * 		get();
	 * 		size();
	 * else
	 * 	return new AbstractSequentialList(
	 * 		listIterator<int> litIterator(int index);
	 * 
	 */
}
