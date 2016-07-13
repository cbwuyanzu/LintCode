public class FindPeakElement {
	/**
	 * @param A
	 *            : An integers array.
	 * @return: return any of peek positions.
	 */
	public int findPeak(int[] A) {
		for (int min = 0, max = A.length - 1, mid = max / 2; min < max; mid = (min + max) / 2) {
			if (min == mid)
				return A[min] < A[max] ? max : min;
			min = A[mid] < A[mid + 1] ? mid : min;
			max = A[mid] > A[mid + 1] ? mid : max;
		}
		return 0;
	}
}
