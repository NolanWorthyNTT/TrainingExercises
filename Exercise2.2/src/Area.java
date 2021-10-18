import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Area {
	private int length;
	private int breadth;
	
	public void setDim(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public int getArea() {
		return length * breadth;
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
	
	public static void main(String[] args) {
		BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
		String inputLine;
		int inputLength, inputBreadth;
		Area a = new Area();
		
		// get input for length
		while(true) {
			try {
				System.out.print("Input length: ");
				inputLine = keyboard.readLine();
				inputLength = Integer.parseInt(inputLine);
				break; // breaks out of while loop once no exceptions thrown
			} catch (NumberFormatException e) {
				System.out.println("No parsable integer: " + e.getMessage());
			} catch (IOException e) {
				System.out.println("I/O error occured: " + e.getMessage());
			}
		}
		
		// get input for breadth
		while(true) {
			try {
				System.out.print("Input breadth: ");
				inputLine = keyboard.readLine();
				inputBreadth = Integer.parseInt(inputLine);
				break; // breaks out of while loop once no exceptions thrown
			} catch (NumberFormatException e) {
				System.out.println("No parsable integer: " + e.getMessage());
			} catch (IOException e) {
				System.out.println("I/O error occured: " + e.getMessage());
			}
		}
		
		a.setDim(inputLength, inputBreadth);
		System.out.println("Area: "  + a.getArea());
	}
}
