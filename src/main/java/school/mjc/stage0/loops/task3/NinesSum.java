package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
		int sum = 0;
		for (int i = 0; i < lengthOfLastNumber; ++i) {
			int number = 0;
			for (int j = 0; j <= i; ++j) {
				number += 9 * Math.pow(10, j);
			}
			sum += number;
		}
		System.out.println(sum);
	}
}
