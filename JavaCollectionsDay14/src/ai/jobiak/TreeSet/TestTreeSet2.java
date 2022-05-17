package ai.jobiak.TreeSet;

import java.util.TreeSet;

public class TestTreeSet2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e1=new Employee("Raju","Hyd","Accounts",10,20000);
		Employee e2=new Employee("Ravi","Thorrur","Programming",20,22000);
		Employee e3=new Employee("Sonu","Wgl","Hr",30,23000);
		
		TreeSet employeeTree=new TreeSet();
		employeeTree.add(e1);
		employeeTree.add(e2);
		employeeTree.add(e3);
		
		System.out.println(employeeTree);
	}

}
