public class FibonacciSumCalculator {

	public static void main(String args[]) throws Exception {

		int N = 100;
		System.out.println("Sum of even terns in fibonacci series of N = " + N + " terms is ===> " + calculateEvenTermSum(N));
	}

	private static int calculateEvenTermSum(int N) throws Exception {

		int a = 1, b = 2, c = 0, sum = 0;
		int i = 2;

		while (i <= N) {

			if (i % 2 == 0)
				sum += b;

			c = a + b;
			a = b;
			b = c;

			i++;

		}

		return sum;

	}
}
