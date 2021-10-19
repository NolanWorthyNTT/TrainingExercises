import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/*** Write a program to Delete a specific line in a text file. ***/
public class DeleteLine {
	// takes a string, returns whether or not it can be parsed to int
	public static boolean stringIsInt(String arg) {
		try {
			int parse = Integer.parseInt(arg);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public static void main(String[] args) {
		int lineToDelete;
		String pathString, lineString;
		
		try (BufferedReader input = new BufferedReader(new InputStreamReader(System.in))) {
			// get input for file name
			System.out.print("Enter name of file to delete from: ");
			pathString = input.readLine();
			
			while(Files.notExists(Paths.get(pathString))) {
				System.out.print("Path doesn't exist. Enter again: ");
				pathString = input.readLine();
			}
			
			// read from file into list
			Path myPath = Paths.get(pathString);
			List<String> lineList = Files.readAllLines(myPath);
			
			// print contents of file
			System.out.println("\nText in file:");
			lineList.stream()
						.forEach(s -> System.out.println(s));
			System.out.println();
			
			try {
				// get input for line number
				System.out.print("Enter line number to delete: ");
				lineString = input.readLine();
				
				while(!stringIsInt(lineString)) {
					System.out.print("Improper input. Please enter an integer: ");
					lineString = input.readLine();
				}
				
				// NumberFormatException has already been dealt with in stringIsInt()
				lineToDelete = Integer.parseInt(lineString);
				
				// remove line entered from list
				lineList.remove(lineToDelete - 1);
				
				// write list back to file
				try(BufferedWriter bw = Files.newBufferedWriter(myPath)) {
					lineList.stream()
								.forEach(s -> {
											try {
												bw.write(s + "\n");
											} catch (IOException e) {
												System.out.println(e.getMessage());
											}});
					
					// print new contents
					System.out.println("\nNew text: ");
					lineList.stream()
								.forEach(s -> System.out.println(s));
					System.out.println();
					
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}
			} catch (IndexOutOfBoundsException e) {
				System.out.println(e.getMessage());
			}	
			catch (IOException e) {
				System.out.println(e.getMessage());
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

}
