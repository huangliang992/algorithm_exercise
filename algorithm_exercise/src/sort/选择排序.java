package sort;

public class ѡ������ {
	/**
	 * ѡ�������㷨 ��δ�����������ҵ���СԪ�أ���ŵ��������е���ʼλ�� �ٴ�ʣ��δ����Ԫ���м���Ѱ����СԪ�أ�Ȼ��ŵ���������ĩβ��
	 * �Դ����ƣ�ֱ������Ԫ�ؾ�������ϡ�
	 * 
	 * @param numbers
	 */
	public static void selectSort(int[] numbers) {
		int size = numbers.length; // ���鳤��
		int temp = 0; // �м����

		for (int i = 0; i < size; i++) {
			int k = i; // ��ȷ����λ��
			// ѡ���Ӧ���ڵ�i��λ�õ���
			for (int j = size - 1; j > i; j--) {
				if (numbers[j] < numbers[k]) {
					k = j;
				}
			}
			// ����������
			temp = numbers[i];
			numbers[i] = numbers[k];
			numbers[k] = temp;
		}
	}
	
	public static void fromBigToSamll(int[] numbers){
		int size = numbers.length;
		int temp = 0;

		for (int i = 0; i < size; i++) {
			int k = i;
			for (int j = size - 1; j > i; j--) {
				if (numbers[j] > numbers[k]) {
					k = j;
				}
			}
			temp = numbers[i];
			numbers[i] = numbers[k];
			numbers[k] = temp;
		}
	}
	
	public static void main(String args[]) {
		int[] a = { 45, 37, 28, 11, 98, 67, 54, 22, 46, 9, 11 };
		//selectSort(a);
		fromBigToSamll(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
