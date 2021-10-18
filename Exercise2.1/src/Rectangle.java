
public class Rectangle {
	private int length;
	private int breadth;
	
	public Rectangle(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
	public int[] Area() {
		return new int[] {length*breadth, length, breadth};
	}

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(10, 15);
		Rectangle r2 = new Rectangle(16, 13);
		
		System.out.println("Area of first rectangle(10 x 15): " + r1.Area()[0]);
		System.out.println("Area of second rectangle(16 x 13): " + r2.Area()[0]);

	}

}
