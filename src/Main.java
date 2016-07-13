public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		// StrStr s = new StrStr();
		// int i = s.strStr("tartarget", "target");
//		SingleNumber s = new SingleNumber();
//		int[] A = { 1, 2, 3, 1, 2 };
//		i = s.singleNumber(A);
		StockII s =new StockII();
		int[] a =new int[0];
        int left = 0, right = a.length - 1;
		i=s.maxProfit(a);
		System.out.print(i);
	}

}
