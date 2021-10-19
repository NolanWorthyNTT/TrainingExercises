
public class LambdaSum<T> {
	
	public static void main(String[] args) {
		
		AdditionInterface<Integer> addInts = (Integer a, Integer b) -> a+b;
		AdditionInterface<Double> addDoubles = (Double a, Double b) -> (long)(a+b);
		AdditionInterface<Short> addShorts = (Short a, Short b) -> (a+b);
		long shortResult = addShorts.add((short)1, (short)2);

		
		System.out.println("Adding Integers 2 and 7: " + addInts.add(2, 7));
		System.out.println("Adding Doubles 4.33 and 70.5: " + addDoubles.add(4.33, 70.5));
		System.out.println("Adding Shorts 1 and 2: " + shortResult);
	}

}
