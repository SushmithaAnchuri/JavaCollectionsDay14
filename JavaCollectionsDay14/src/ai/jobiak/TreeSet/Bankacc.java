package ai.jobiak.TreeSet;

import java.util.Objects;

public class Bankacc implements Comparable{

	private String name;
	private double accNumber;
	private String bankName;
	public Bankacc(String name, double accNumber, String bankName) {
		super();
		this.name = name;
		this.accNumber = accNumber;
		this.bankName = bankName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(double accNumber) {
		this.accNumber = accNumber;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	@Override
	public String toString() {
		return "Bankacc [name=" + name + ", accNumber=" + accNumber + ", bankName=" + bankName + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(accNumber, bankName, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bankacc other = (Bankacc) obj;
		return Double.doubleToLongBits(accNumber) == Double.doubleToLongBits(other.accNumber)
				&& Objects.equals(bankName, other.bankName) && Objects.equals(name, other.name);
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Bankacc ref=(Bankacc)o;
		if(this.name.compareTo(ref.getName())<0) {
			return -1;
		}
		else if(this.name.compareTo(ref.getName())==0) {
			return 0;
		}
		else if(this.name.compareTo(ref.getName())>0) {
			return 1;
		}
		return 0;
	}
	
}
