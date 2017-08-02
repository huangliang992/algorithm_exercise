package ����;

import java.util.Scanner;
/**
 * ��������
 * @author hl
 *
 */
public class Main {
	/** ������������������ʵ����ĿҪ��Ĺ��� **/
	/** ��Ȼ����Ҳ���Բ��������ģ����������ȫ�����Լ����뷨�� ^-^ **/
	static int cut(int[] parts) {
		// �ȶԹ���������
		sort(parts, 0, parts.length - 1);
		int total = 0;
		// ���������ż��
		if (parts.length % 2 == 0) {
			int temp = (int) Math.ceil((Math.log(parts.length) / Math.log(2)));
			for (int i = 0; i < parts.length; i++) {
				total = total + temp * parts[i];
			}
		} else {
			int temp = (int) Math.ceil((Math.log(parts.length) / Math.log(2)));
			for (int i = 0; i < parts.length; i++) {
				if (i != parts.length / 2) {
					total = total + (temp - 1) * parts[i];
				} else {
					total = total + temp * parts[i];
				}
			}
		}
		return total;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int pieces = Integer.parseInt(in.nextLine().trim());
		int[] parts = new int[pieces];
		for (int i = 0; i < pieces; i++) {
			parts[i] = Integer.parseInt(in.nextLine().trim());
		}
		System.out.println(cut(parts));
	}

	public static void sort(int[] a, int low, int high) {
		int start = low;
		int end = high;
		int key = a[low];

		while (end > start) {
			// �Ӻ���ǰ�Ƚ�
			while (end > start && a[end] >= key) // ���û�бȹؼ�ֵС�ģ��Ƚ���һ����ֱ���бȹؼ�ֵС�Ľ���λ�ã�Ȼ���ִ�ǰ����Ƚ�
				end--;
			if (a[end] <= key) {
				int temp = a[end];
				a[end] = a[start];
				a[start] = temp;
			}
			// ��ǰ����Ƚ�
			while (end > start && a[start] <= key)// ���û�бȹؼ�ֵ��ģ��Ƚ���һ����ֱ���бȹؼ�ֵ��Ľ���λ��
				start++;
			if (a[start] >= key) {
				int temp = a[start];
				a[start] = a[end];
				a[end] = temp;
			}
			// ��ʱ��һ��ѭ���ȽϽ������ؼ�ֵ��λ���Ѿ�ȷ���ˡ���ߵ�ֵ���ȹؼ�ֵС���ұߵ�ֵ���ȹؼ�ֵ�󣬵������ߵ�˳���п����ǲ�һ���ģ���������ĵݹ����
		}
		// �ݹ�
		if (start > low)
			sort(a, low, start - 1);// ������С���һ������λ�õ��ؼ�ֵ����-1
		if (end < high)
			sort(a, end + 1, high);// �ұ����С��ӹؼ�ֵ����+1�����һ��
	}

	public static int count(int i) {
		int total = 0;
		while (i != 0) {
			i = i / 2;
			total++;
		}
		return total;
	}
}