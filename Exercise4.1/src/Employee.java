import java.text.DecimalFormat;
import java.text.NumberFormat;

public abstract class Employee {
	private int employeeId;
	private String employeeName;
	private double basicSalary;
	private double specialAllowance;
	private double hra;
	private double ta;
	private double tax = 2500;
	
	public Employee(int employeeId, String employeeName, double basicSalary, double hra) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.basicSalary = basicSalary;
		this.hra = hra;
	}
	
	public double calcNetSalary() {
		return basicSalary + hra + specialAllowance + ta - tax;
	}
	
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double getSpecialAllowance() {
		return specialAllowance;
	}

	public void setSpecialAllowance(double specialAllowance) {
		this.specialAllowance = specialAllowance;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	public double getTa() {
		return ta;
	}

	public void setTa(double ta) {
		this.ta = ta;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
	
	public static void main(String[] args) {
		NumberFormat nf = new DecimalFormat("$###,##0.00");
		
		Employee m = new Manager(1, "John Doe", 100_000, 10_000);
		System.out.println("Net salary: " + nf.format(m.calcNetSalary()));
		
		Employee a = new AssistantManager(2, "Steve Smith", 90_000, 19_000);
		System.out.println("Net salaray: " + nf.format(a.calcNetSalary()));
	}
}
