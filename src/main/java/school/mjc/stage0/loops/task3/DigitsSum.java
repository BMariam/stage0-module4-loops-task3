package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t) {
		if (t < 0) {
			t = -t;
		}
		int length = ("" + t).length();
		int sum = 0;
		for (int i = 1; i <= length; ++i) {
			sum += t % 10;	
			t /= 10;
		}
		System.out.println(sum);
    }
}
