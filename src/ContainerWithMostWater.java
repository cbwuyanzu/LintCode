public class ContainerWithMostWater {
	/**
	 * @param heights:
	 *            an array of integers
	 * @return: an integer
	 */
	public int maxArea(int[] heights) {
		// write your code here
		if (heights.length < 2) {
			return 0;
		}
		int product = 0;
		for (int i = 0; i < heights.length - 1; i++) {
			for (int j = i + 1; j < heights.length; j++) {
				int min = heights[i] > heights[j] ? heights[j] : heights[i];
				product = product > min * (j - i) ? product : min * (j - i);
			}
		}
		return product;
	}
}