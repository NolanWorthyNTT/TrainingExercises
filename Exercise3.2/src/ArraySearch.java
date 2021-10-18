
public class ArraySearch {
	public static int search(int[] arr, int toFind) {
		// linear search
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == toFind) {
				return i;
			}
		}
		
		// if value isn't found
		return -1;
	}

	public static void main(String[] args) {
		int[] arr = {2, 10, 55, 8834, 97, 1, 0};
		int toFind = 97;
		
		int index = search(arr, toFind);
		if(index != -1) {
			System.out.println("Value " + toFind + " found at index " + index);
		} else {
			System.out.println("Value " + toFind + " not found");
		}
	}

}
