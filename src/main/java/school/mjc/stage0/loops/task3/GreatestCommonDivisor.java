package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
		int divisor = 1;
		if (0 == first) {
			divisor = second;
		} else if (0 == second) {
			divisor = first;
		} else if (first == second) {
			divisor = first;
		} else {
			divisor = (first < second) ? first : second;
			for (; divisor >= 1; --divisor) {
				if (0 == first % divisor && 0 == second % divisor) {
					break;
				}
			}
		}
		System.out.println(divisor);
    }
}
