public class FibonacciIterative implements Fibonacci {
	public int fibonacci(int n) {
		int sum = 0;
		int lastsum1 = 1;
		int lastsum2 = 1;

		for (int i = 0; i < n; i++) {
			if (i == 1 || i == 0) {
				sum += 1;
			} else {
				sum = lastsum1 + lastsum2;
				lastsum2 = lastsum1;
				lastsum1 = sum;
			}
		}

		return sum;
	}
}
