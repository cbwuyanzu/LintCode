public class SingleNumber {
	/**
	 * @param A
	 *            : an integer array return : a integer
	 */
	public int singleNumber(int[] A) {
		// Write your code here
		int a = 0;
		for (int i = 0; i < A.length; i++) {
			a = a ^ A[i];
		}
		return a;
	}
}
