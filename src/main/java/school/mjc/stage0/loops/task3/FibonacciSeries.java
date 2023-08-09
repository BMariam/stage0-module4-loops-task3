package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
		int previousNumber = 0;
		int currentNumber = 1;
		for (int i = 1; i <= lastFibonacci; ++i) {
			if (1 == i) {
				System.out.println(previousNumber);
			} 
			if (2 == i) {
				System.out.println(currentNumber);
			}
			if (i > 2) {
				int nextNumber = previousNumber + currentNumber;
				previousNumber = currentNumber;
				currentNumber = nextNumber;
				System.out.println(nextNumber);
			}
		}
    }
}
