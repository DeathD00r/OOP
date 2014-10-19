import java.util.*;

public class dz1_2{
	public static void main(String[] arg){
		System.out.println("Enter number of Fibonacci")
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println();
		System.out.println("Iteration")
		System.out.println(getFibonacciIter(n));
		System.out.println("Recursively")
		System.out.println(getFibonacciRec(n));//рекурсивный метод намного прожорливее к
		//ресурсам компьютера чем итерационный.
	}

	static int getFibonacciIter(int n){
		int a = -1, b = 0, fib = 0;
		for(int i = 0; i < n; i++){
			fib = a + b;
			a = b;
			b = fib;
		}
		return -fib;

	}

	static int getFibonacciRec(int n){
  		if(n==1) return 1;
  		if(n==2) return 1;
  		return (getFibonacciRec(n-2) + getFibonacciRec(n-1));
	}
}