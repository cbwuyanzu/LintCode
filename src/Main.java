import java.util.Arrays;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		// StrStr s = new StrStr();
		// int i = s.strStr("tartarget", "target");
		// SingleNumber s = new SingleNumber();
		// int[] A = { 1, 2, 3, 1, 2 };
		// i = s.singleNumber(A);
		RemoveElement re = new RemoveElement();
		int[] a = { 0, 4, 4, 0, 4, 4, 4, 0, 2 };
		int ele = 4;
		i = re.removeElement(a, ele);
		System.out.print(i);
		boolean[] t = new boolean[5];
		t[0] = true;
		System.out.println(t[1]);
		int[] pos = new int[5];
		Arrays.fill(pos, -1);
		for (int j = 0; j < pos.length; j++) {
			System.out.println(pos[j]);
		}
	}

}
