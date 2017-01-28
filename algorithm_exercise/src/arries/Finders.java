package arries;

public class Finders {
	public int findElement(int[] A, int n, int x) {
		// write code here
		int result = 0;
		int i = 0;
		int j = n - 1;
		while (i != j - 1) {
			int k = (i + j) / 2;
			if (A[k] > A[j]) {
				i = k;
			} else {
				j = k;
			}
		}
		System.out.println(i);

		int i1 = 0;
		int j1 = i;
		if (i1 == j1 && A[i1] == x) {
			result = i1;
		}
		while (i1 != j1) {
			int k = (i1 + j1) / 2;
			if (A[k] > x) {
				j1 = k;
			} else if (A[k] < x) {
				i1 = k;
			} else {
				result = k;
				break;
			}
		}

		int i2 = i + 1;
		int j2 = n - 1;
		if (i2 == j2 && A[i2] == x) {
			result = i2;
		}
		while (i2 != j2) {
			int k = (i2 + j2) / 2;
			if (A[k] > x) {
				j2 = k;
			} else if (A[k] < x) {
				i2 = k;
			} else {
				result = k;
				break;
			}
		}
		return result;
	}

	public static void main(String args[]) {
		Finders f = new Finders();
		int a[] = { 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34,
				35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60,
				61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 1, 2, 3, 4, 5, 6, 7, 8,
				9 };
		System.out.println(f.findElement(a, 80, 6));
		int a1[] = { 6, 1 };
		System.out.println(f.findElement(a1, 2, 1));
	}
}
