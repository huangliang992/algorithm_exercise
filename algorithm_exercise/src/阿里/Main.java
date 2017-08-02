package 阿里;

import java.util.Scanner;
/**
 * 哈夫曼树
 * @author hl
 *
 */
public class Main {
	/** 请完成下面这个函数，实现题目要求的功能 **/
	/** 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^ **/
	static int cut(int[] parts) {
		// 先对工作量排序
		sort(parts, 0, parts.length - 1);
		int total = 0;
		// 如果长度是偶数
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
			// 从后往前比较
			while (end > start && a[end] >= key) // 如果没有比关键值小的，比较下一个，直到有比关键值小的交换位置，然后又从前往后比较
				end--;
			if (a[end] <= key) {
				int temp = a[end];
				a[end] = a[start];
				a[start] = temp;
			}
			// 从前往后比较
			while (end > start && a[start] <= key)// 如果没有比关键值大的，比较下一个，直到有比关键值大的交换位置
				start++;
			if (a[start] >= key) {
				int temp = a[start];
				a[start] = a[end];
				a[end] = temp;
			}
			// 此时第一次循环比较结束，关键值的位置已经确定了。左边的值都比关键值小，右边的值都比关键值大，但是两边的顺序还有可能是不一样的，进行下面的递归调用
		}
		// 递归
		if (start > low)
			sort(a, low, start - 1);// 左边序列。第一个索引位置到关键值索引-1
		if (end < high)
			sort(a, end + 1, high);// 右边序列。从关键值索引+1到最后一个
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