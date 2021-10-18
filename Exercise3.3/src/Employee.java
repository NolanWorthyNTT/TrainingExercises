import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Employee {
	private int eid;
	private String name;
	private String address;
	private double salary;
	private int yearsWithCompany;
	

	public Employee(int eid, String name, String address, double salary, int yearsWithCompany) {
		this.eid = eid;
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.yearsWithCompany = yearsWithCompany;
	}
	
	public void displayEmployee() {
		NumberFormat nf = new DecimalFormat("$###,##0.00");
		
		System.out.println("EID:                  " + eid);
		System.out.println("Name:                 " + name);
		System.out.println("Address:              " + address);
		System.out.println("Salary:               " + nf.format(salary));
		System.out.println("Years with company:   " + yearsWithCompany);
	}

	public static void main(String[] args) {
		Employee ryan = new Employee(1001, "Ryan Smith", "525 Cherry Road", 90_000, 7);
		ryan.displayEmployee();
	}

}
