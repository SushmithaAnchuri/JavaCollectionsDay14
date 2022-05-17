package ai.jobiak.HashMap;

public class Bankaccount {

	private String name;
	private double accNumber;
	private String bankName;
	public Bankaccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bankaccount(String name, double accNumber, String bankName) {
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
		return "Bankaccount [name=" + name + ", accNumber=" + accNumber + ", bankName=" + bankName + "]";
	}
	
	
}
