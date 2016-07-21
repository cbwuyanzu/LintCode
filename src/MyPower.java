public class MyPower {
	/**
	 * @param x
	 *            the base number
	 * @param n
	 *            the power number
	 * @return the result
	 */
	public double myPow1(double x, int n) {
		// Write your code here
		{
			if (n == 0)
				return 1.0;
			if (n < 0)
				return 1.0 / myPow1(x, -n);
			return x * myPow1(x, n - 1);
		}
	}

	public double myPow2(double x, int n) {
		// Write your code here
		if (x == 0) {
			return 0;
		}
		if (n == 0) {
			return 1;
		}
		double y = 1;
		if (n > 0) {
			for (int i = 0; i < n; i++) {
				y *= x;
			}
			return y;
		}
		if (n < 0) {
			for (int i = 0; i > n; i--) {
				y /= x;
			}
		}
		return y;
	}
}
