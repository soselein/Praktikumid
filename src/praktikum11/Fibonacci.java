package praktikum11;

import lib.TextIO;

public class Fibonacci {

	public static void main(String[] args) {
		
		System.out.println("Sisesta fibonacci jada liikme järk");
		
		int jark = TextIO.getInt();
		
		int vastus = fibonacci(jark);
		
		System.out.println(vastus);
	

}

	private static int fibonacci(int jark) {
		if(jark==0)
			return 0;
		else if(jark==1)
			return 1;
		else
			return fibonacci(jark-1)+fibonacci(jark-2);
	}
}
