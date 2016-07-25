
public class RemoveElement {
	public int removeElement(int[] A, int elem) {
		// write your code here
		int l = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] == elem) {
				l++;
			} else {
				A[i - l] = A[i];
			}
		}
		return A.length - l;
	}
}
