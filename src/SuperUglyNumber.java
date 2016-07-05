public class SuperUglyNumber {
    /**
     * @param n a positive integer
     * @param primes the given prime list
     * @return the nth super ugly number
     */
	public int nthSuperUglyNumber(int n, int[] primes) {
		// Write your code here
		if (n == 1)
			return 1;
		if (n == 2)
			return primes[1];
		int[] points = new int[primes.length];
		int[] results = new int[primes.length];
		int[] uglies = new int[n];
		uglies[0] = 1;
		for (int i = 1; i < n; i++) {
			int pos = 0;
			int min = uglies[points[0]] * primes[0];
			for (int j = 1; j < primes.length; j++) {
				results[j] = uglies[points[j]] * primes[j];
				if (results[j] == min) {
					points[j]++;
				}
				if (results[j] < min) {
					min = results[j];
					pos = j;
				}
			}
			uglies[i] = min;
			points[pos]++;
			// if
		}
		return uglies[n - 1];
	}
}