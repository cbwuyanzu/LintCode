class SortColors2 {
	/**
	 * @param colors:
	 *            A list of integer
	 * @param k:
	 *            An integer
	 * @return: nothing
	 */
	public void sortColors2(int[] colors, int k) {
		// write your code here
		for (int i = 0; i < colors.length - 1; i++) {
			int min = colors[i];
			int pos = i;
			for (int j = i + 1; j < colors.length; j++) {
				if (colors[j] < min) {
					min = colors[j];
					pos = j;
				}
			}
			int temp = colors[i];
			colors[i] = min;
			colors[pos] = temp;
		}
	}
}