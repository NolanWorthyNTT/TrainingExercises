import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*** Write a program to Create a file and Store the Information. ***/
public class CreateFile {

	public static void main(String[] args) {
		Path fileToCreate = Paths.get("myFile.txt");
		
		//String fileStatus = Files.exists(fileToCreate) ? "File already exists. Please delete." : "File doesn't exist. Good to go.";
		//System.out.println(fileStatus);
		
		try {
			Path myFile = Files.createFile(fileToCreate);
			System.out.println("File " + myFile + " created.");
			
			try (BufferedWriter writer = Files.newBufferedWriter(myFile)) {
				writer.write("This is the file I'm using to test file I/O in Java.\n");
				writer.write("I'm writing with a BufferedWriter.");
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		} catch (FileAlreadyExistsException e) {
			System.out.println("File already exists: " + e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} 
	}
}
