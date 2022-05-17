package ai.jobiak.HashMap;

import java.util.HashMap;

public class Employee2 {

	private long id;   
    private String name;   
    private String address;    
    private double salary;
	
    
	public Employee2() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee2(long id, String name, String address, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEmpName() {
		return name;
	}
	public void setEmpName(String empName) {
		this.name = empName;
	}
	public String getEmpAddress() {
		return address;
	}
	public void setEmpAddress(String empAddress) {
		this.address = empAddress;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee2 [id=" + id + ", empName=" + name + ", empAddress=" + address + ", salary=" + salary
				+ "]";
	}
	
    
    
    
	
}
