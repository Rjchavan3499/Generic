package day13.com;

public class PrintArray<T>{
	
	private T[] inpurArray;
	
	public PrintArray(T[]  inputArray) {
		this.inpurArray = inputArray;
	}
	
	public void toPrint() {
		PrintArray.toPrint(this.inpurArray);
	}
	
	public static <E> void toPrint(E[]inputArray) {
		for(E element : inputArray) {
			System.out.printf("%s",element);
			
		}
		System.out.println();
	}
	
	public static void main(String[] args)
	{
		Integer [] intArray = {1 ,2 ,3, 4,5};
	
		new PrintArray(intArray).toPrint();
	}
	
	
	

}
