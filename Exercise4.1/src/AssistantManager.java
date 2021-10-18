
public class AssistantManager extends Employee {
	public AssistantManager(int employeeId, String employeeName, double basicSalary, double hra) {
		super(employeeId, employeeName, basicSalary, hra);
		
		this.setSpecialAllowance(12_000);
		this.setTa(0.15*this.getBasicSalary());
	}
}
