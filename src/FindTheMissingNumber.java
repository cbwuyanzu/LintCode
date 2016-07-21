
public class FindTheMissingNumber {
	/**
	 * @param nums:
	 *            an array of integers
	 * @return: an integer
	 */
	public int findMissing(int[] nums) {
		// write your code here
		// if (nums == null){
		// return 0;
		// }
		int x = 0;
		for (int i = 0; i < nums.length; i++) {
			x ^= (i + 1) ^ nums[i];
		}
		return x;
	}
}