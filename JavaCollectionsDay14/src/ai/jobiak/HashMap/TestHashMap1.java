package ai.jobiak.HashMap;

import java.util.Map.Entry;
import java.util.*;

public class TestHashMap1 {

	public static void main(String[] args) {
		
		HashMap<Employee2,String> employeeMap = new HashMap<Employee2,String>();  

	   	      
	    Employee2 employee1 = new Employee2(20,"Sammer","Warangal",20000);
	    Employee2 employee2 = new Employee2(30,"Raju","Hydrebad",20000);
	    employeeMap.put(employee1,"India");    
	    employeeMap.put(employee2,"Japan"); 
	    
	    System.out.println(employeeMap.size());
		System.out.println(employeeMap);
		System.out.println(employeeMap.get("Apple"));
		
		Set keys=employeeMap.keySet();
		Iterator iter=keys.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		Collection values=employeeMap.values();
		Iterator iter2=values.iterator();
		while(iter2.hasNext()) {
			System.out.println(iter2.next());
		}
		Set<Entry<Employee2,String>>entries=employeeMap.entrySet();
		Iterator iter3=entries.iterator();
		while(iter3.hasNext()) {
			Entry entry=(Entry) iter3.next();
			System.out.println(entry.getKey()+"::"+entry.getValue());
		}
		
	}

}
