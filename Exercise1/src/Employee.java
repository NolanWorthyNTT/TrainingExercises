
public class Employee {
	private String name;
	private int eid;
	
	public Employee(String name, int eid) {
		this.name = name;
		this.eid = eid;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public static void main(String[] args) {
		Employee john = new Employee("John", 101);
		Employee kate = new Employee("Kate", 102);
		
		System.out.println(john.getName() + ": " + john.getEid());
		System.out.println(kate.getName() + ": " + kate.getEid());
	}
}
