public class Sort {
	static int[] a = { 44, 22, 2, 32, 54, 22, 88, 77, 99, 11 };
	public static void main(String[] args) {
		quickSort(a);
		for (int sb : a) {
			System.out.print(sb + " ");
		}
	}

	public static void selectSort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			int pos = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[pos]) {
					pos = j;
				}
			}
			int temp = a[pos];
			a[pos] = a[i];
			a[i] = temp;
		}
	}

	public static void bubbleSort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}

		}
	}

	public static void quickSort(int[] a) {
		sort(0,a.length-1);
	}

	public static int partition(int[] a, int low, int high) {
		int key = a[low];
		while (low < high) {
			while (low < high && a[high] >= key) {
				high--;
			}
			a[low] = a[high];
			while (low < high && a[low] <= key) {
				low++;
			}
			a[high] = a[low];
		}
		a[low] = key;
		return low;

	}

	public static void sort(int low, int high) {
		if (low < high) {
			int result = partition(a, low, high);
			sort(0, result - 1);
			sort(result + 1, high);
		}
	}
}
