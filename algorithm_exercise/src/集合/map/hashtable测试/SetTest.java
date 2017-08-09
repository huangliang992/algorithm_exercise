package ºØ∫œ.map.hashtable≤‚ ‘;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
	
	public static void main(String args[]){
		String [] list = {"a","c","b","d","e"};
		Set<String> set = new TreeSet<String>();
		for(int i=0;i<list.length;i++){
			set.add(list[i]);
		}
		Iterator<String> it = set.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
