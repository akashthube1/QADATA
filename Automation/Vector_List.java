package com.collections;

import java.util.*;

public class Vector_List {

	public static void main(String[] args) {
		
		Vector v = new Vector();
		v.add("Akash");
	    v.add(895);
	    v.add(100.22);
	    v.add('a');
	    
	    System.out.println(v);
	    Iterator it = v.iterator();
	    while(it.hasNext())
	    {
	    	Object ob = it.next();
	    	System.out.println(ob);
	    }
	    /*Vector v1 = new Vector(v);
	    v1.add("Akash");
	    Iterator it1 = v1.iterator();
	    while(it1.hasNext())
	    {
	    	Object ob1 = it1.next();
	    	System.out.println(ob1);
	    }*/

	}

}
