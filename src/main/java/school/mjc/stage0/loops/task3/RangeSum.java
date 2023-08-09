package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
		int sum = 0;
		for (int counter = firstBoarder; counter <= secondBoarder; ++counter) {
			sum += counter;
		}
		System.out.println(sum);
    }
}
