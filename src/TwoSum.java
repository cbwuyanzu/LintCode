import java.util.HashMap;

public class TwoSum {
	public int[] twoSum(int[] numbers, int target) {
		int[] res = new int[2];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < numbers.length; i++) {
			map.put(numbers[i], i);
		}
		for (int i = 0; i < numbers.length; i++) {
			int ele2 = target - numbers[i];
			if ((map.get(ele2) != null) && (map.get(ele2) != i)) {
				res[0] = i + 1;
				res[1] = map.get(ele2) + 1;
				break;
			}
		}
		return res;
		// write your code here
	}
}
