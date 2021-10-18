
public class Manager extends Employee {
	public Manager(int employeeId, String employeeName, double basicSalary, double hra) {
		super(employeeId, employeeName, basicSalary, hra);
		
		this.setSpecialAllowance(20_000);
		this.setTa(0.2*this.getBasicSalary());
	}
}
