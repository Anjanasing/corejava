package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {

	public static void main(String[] args) {


	        HashSet<String> hashSet = new HashSet<String>();
	        
	        hashSet.add("suman");
	        hashSet.add("aanad");
	        hashSet.add("poonam");
	        hashSet.add("Ram");
	        hashSet.add("anjana");
	        hashSet.add("Ram");
	        hashSet.add("titu");
	        hashSet.add("viki");
	        hashSet.add(null);


	        
	        Iterator<String> itr = hashSet.iterator();
	        
	        while(itr.hasNext()) {
	            System.out.println(itr.next());
	        }

	    }





	}


