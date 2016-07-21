
public class HouseRobber {
	public long houseRobber(int[] A) {
		// write your code here
		if (A == null || A.length == 0) {
			return 0;
		} else if (A.length == 1) {
			return A[0];
		} else {
			long[] money = new long[A.length];
			money[0] = A[0];
			money[1] = Math.max(A[0], A[1]);
			for (int i = 2; i < A.length; i++) {
				money[i] = Math.max(money[i - 2] + A[i], money[i - 1]);
			}
			return money[A.length - 1];
		}
	}
}
