package collection;

import java.util.Hashtable;

public class HashTableDemo1 {

	public static void main(String[] args) {

Hashtable<Integer, String> hashtable=new Hashtable<>();
   
hashtable.put(101,"suman");
hashtable.put(102,"kiran");
hashtable.put(103,"anita");
hashtable.put(104,"tunnu");
hashtable.put(105,"tanya");

hashtable.forEach((key, value)->{
	System.out.println(key+" "+value);
	});









	}

}
