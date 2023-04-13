package Mutilevel;

public class FulltimeEmployee extends Employee {
	int salary;
	String bankAccountNumber;
	
	public FulltimeEmployee(int salary, String bankAccountNumber) {
		super();
		this.salary = salary;
		this.bankAccountNumber = bankAccountNumber;
		
	}

	public FulltimeEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FulltimeEmployee(String name, int id, String email, int salary, String bankAccountNumber) {
		super(name, id, email);
		this.salary = salary;
		this.bankAccountNumber = bankAccountNumber;
	}
	
	public FulltimeEmployee(String name, int id, String email) {
		super(name, id, email);
	}

	
	@Override
	public void display() {
		super.display();
		System.out.println("FullTimeEmployee Display called");
		System.out.println("Name:"+name);
	}

	@Override
	public String toString() {
		return "FullTimeEmployee [salary=" + salary + ", bankAccountNumber=" + bankAccountNumber + ", name=" + name
				+ ", id=" + id + ", email=" + email + "]";
	}
}
