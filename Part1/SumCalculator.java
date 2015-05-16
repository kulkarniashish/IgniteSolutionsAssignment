public class SumCalculator {

	public static void main(String args[]) {

		int a = 3, b = 5, N = 1000;
		System.out.println("Sum of multiple of a = " + a + " and b = " + b
				+ " below N = " + N + " ===> "
				+ calculateSumOfMultiplesOfAAndB(N, a, b));
	}

	private static int calculateSumOfMultiplesOfAAndB(int N, int a, int b) {

		int sum = 0;
		for (int i = 1; i < N; i++) {
			if (i % 3 == 0 || i % 5 == 0)
				sum += i;
		}
		return sum;
	}
}
