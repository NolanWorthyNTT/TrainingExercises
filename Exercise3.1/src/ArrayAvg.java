
public class ArrayAvg {
	public static void main(String[] args) {
		int[] arr = {2, 10, 55, 8834, 97, 1, 0};
		int sum = 0;
		
		for(int i: arr) {
			sum += i;
		}
		
		// cast sum to double to avoid integer division (loss of precision)
		double avg = (double)sum / arr.length;
		
		System.out.println("Average of elements in array: " + avg);
	}
}
