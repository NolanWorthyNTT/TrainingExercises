
public class Employee {
	private double salary;
	private int hoursPerDay;
	
	public void getInfo(double salary, int hoursPerDay) {
		
	}
	
	public void AddSal() {
		if(salary < 500) salary += 10;
	}
	
	public void AddWork() {
		if(hoursPerDay > 6) salary += 5;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getHoursPerDay() {
		return hoursPerDay;
	}

	public void setHoursPerDay(int hoursPerDay) {
		this.hoursPerDay = hoursPerDay;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
