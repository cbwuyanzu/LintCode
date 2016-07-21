public class FindMinimumInRotatedSortedArray {
    /**
     * @param num: a rotated sorted array
     * @return: the minimum number in the array
     */
    public int findMin(int[] num) {
		if (num.length == 1) {
			return num[0];
		}
		int left = 0;
		int right = num.length - 1;
		int mid = (left + right) / 2;
		if (num[left]<=num[mid]&& num[mid]<=num[right]){
		    return num[left];
		}
		while (left < mid) {
			if (num[left] > num[mid]) {
				right = mid;
			} else if (num[mid] > num[right]) {
				left = mid;
			}
			mid = (left + right) / 2;
		}
		return num[right];
	}
}
