package collection_1_may;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapEmployee {

	public static void main(String[] args) {
		 
		Emp e= new Emp("neha","delhi",23000);
		Emp e1= new Emp("amit","noida",12000);
		Emp e2= new Emp("riya","delhi",9000);
		Emp e3= new Emp("ashu","noida",23576);
		Emp e4= new Emp("chatan","delhi",16000);
		Emp e5= new Emp("bina","noida",7000);
		Emp e6= new Emp("kamal","delhi",23100);

		
		 Map<Integer,Emp> m= new TreeMap<Integer,Emp> ();// output   sorted order of key 
		
		m.put(1,e);
		m.put(5,e1);
		m.put(6,e2);
		m.put(2,e3);
		m.put(4,e4);
		m.put(5,e5);
		m.put(3,e6);
		
    	//System.out.println(m);
		
		//traverse the map 
		
		//map doesnot have iterator method
		//we will store map data to set and use iterator on set to traverse the data
		Set s= m.entrySet();
		Iterator i= s.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}}
		
