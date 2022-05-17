package ai.jobiak.HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class TestHashMap2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Bankaccount,String> bank = new HashMap<Bankaccount,String>();
		
		Bankaccount acc1=new Bankaccount("Arjun",236745,"Kotak");
		Bankaccount acc2=new Bankaccount("Preethi",236987,"BAnkofbaroda");
		Bankaccount acc3=new Bankaccount("Sudheer",536746,"SBI");
		bank.put(acc1,"Hydrebad");    
	    bank.put(acc2,"Khammam");
	    bank.put(acc3,"Warangal");
	    
	    System.out.println(bank.size());
		System.out.println(bank);
		System.out.println(bank.get("Preethi"));
		
		Set keys=bank.keySet();
		Iterator iter=keys.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		Collection values=bank.values();
		Iterator iter2=values.iterator();
		while(iter2.hasNext()) {
			System.out.println(iter2.next());
		}
		Set<Entry<Bankaccount, String>>entries=bank.entrySet();
		Iterator iter3=entries.iterator();
		Object obj=iter3.next();
		while(iter3.hasNext()) {
			Entry entry=(Entry) obj;
			System.out.println(entry.getKey()+"::"+entry.getValue());
		}
	}

}
