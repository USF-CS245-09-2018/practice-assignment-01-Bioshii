public class FactorialIterative implements Factorial {
	public int factorial(int n) {
		int sum = 1;
		for (int i = n; i > 1; i--) {
			sum *= i;
		}

		return sum;
	}

}