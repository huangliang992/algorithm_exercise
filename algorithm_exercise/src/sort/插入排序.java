package sort;

public class 插入排序 {
	/**
	 * 插入排序
	 * 
	 * 从第一个元素开始，该元素可以认为已经被排序 取出下一个元素，在已经排序的元素序列中从后向前扫描
	 * 如果该元素（已排序）大于新元素，将该元素移到下一位置 重复步骤3，直到找到已排序的元素小于或者等于新元素的位置 将新元素插入到该位置中 重复步骤2
	 * 
	 * @param numbers
	 *            待排序数组
	 */
	public static void insertSort(int[] numbers) {
		int size = numbers.length;
		int temp = 0;
		int j = 0;

		for (int i = 0; i < size; i++) {
			temp = numbers[i];
			// 假如temp比前面的值小，则将前面的值后移
			for (j = i; j > 0 && temp < numbers[j - 1]; j--) {
				numbers[j] = numbers[j - 1];
			}
			numbers[j] = temp;
		}
	}
	
	/**
	 * 从大到小排序
	 * @param numbers
	 */
	public static void fromBigToSamll(int[] numbers){
		int size = numbers.length;
		int temp = 0;
		int j = 0;
		for (int i = 0; i < size; i++) {
			temp = numbers[i];
			for (j = i; j > 0 && temp > numbers[j - 1]; j--) {
				numbers[j] = numbers[j - 1];
			}
			numbers[j] = temp;
		}
	}
	
	public static void main(String args[]) {
		int[] a = { 45, 37, 28, 11, 98, 67, 54, 22, 46, 9, 11 };
		//insertSort(a);
		fromBigToSamll(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
