package ai.jobiak.HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class TestHashMap3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Course,Integer> course = new HashMap<Course,Integer>();
		
		Course c1=new Course("Java","Computer basics",20.0,500.0);
		Course c2=new Course("C","Algo",40.0,700.0);
		Course c3=new Course("C++","Computers Tech",60.0,500.0);
		course.put(c1,10);    
	    course.put(c2,23);
	    course.put(c3,30);
	    
	    System.out.println(course.size());
		System.out.println(course);
		System.out.println(course.get("Preethi"));
		
		Set keys=course.keySet();
		Iterator iter=keys.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		Collection values=course.values();
		Iterator iter2=values.iterator();
		while(iter2.hasNext()) {
			System.out.println(iter2.next());
		}
		Set<Entry<Course, Integer>>entries=course.entrySet();
		Iterator iter3=entries.iterator();
		Object obj=iter3.next();
		while(iter3.hasNext()) {
			Entry entry=(Entry) obj;
			System.out.println(entry.getKey()+"::"+entry.getValue());
		}
	}

	}

