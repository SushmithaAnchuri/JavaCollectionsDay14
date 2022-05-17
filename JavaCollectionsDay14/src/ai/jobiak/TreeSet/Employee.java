package ai.jobiak.TreeSet;

import java.util.Objects;

//import ai.jobiak.collections.Employee;

public class Employee implements Comparable {

	private String empName;
	private String address;
	private String Department;
	private int empId;
	private int salary;
	public Employee(String empName, String address, String department, int empId, int salary) {
		super();
		this.empName = empName;
		this.address = address;
		Department = department;
		this.empId = empId;
		this.salary = salary;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public int hashCode() {
		return Objects.hash(Department, address, empId, empName, salary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(Department, other.Department) && Objects.equals(address, other.address)
				&& empId == other.empId && Objects.equals(empName, other.empName) && salary == other.salary;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", address=" + address + ", Department=" + Department + ", empId="
				+ empId + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Employee ref=(Employee)o;
		if(this.empName.compareTo(ref.getEmpName())<0) {
			return -1;
		}
		else if(this.empName.compareTo(ref.getEmpName())==0) {
			return 0;
		}
		else if(this.empName.compareTo(ref.getEmpName())>0) {
			return 1;
		}
		return 0;
	}
	
	
}
