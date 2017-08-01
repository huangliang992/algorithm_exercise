package sort;

public class ϣ������ {
	/**
	 * ϣ�������ԭ��:���������������Ҫ����Ӵ�С���У��������Ƚ�������з��飬Ȼ�󽫽ϴ�ֵ�Ƶ�ǰ�棬��Сֵ
	 * �Ƶ����棬�������������в���������������һ��ʼ���ò���������������ݽ������ƶ��Ĵ���������˵ϣ�������Ǽ�ǿ ��Ĳ������� ������5, 2,
	 * 8, 9, 1, 3��4��˵�����鳤��Ϊ7����incrementΪ3ʱ�������Ϊ��������
	 * 5��2��8��9��1��3��4����һ������9��5�Ƚϣ�1��2�Ƚϣ�3��8�Ƚϣ�4�ͱ����±�ֵСincrement������ֵ��Ƚ�
	 * �������ǰ��մӴ�С���У����Դ�Ļ�����ǰ�棬��һ�����������Ϊ9, 2, 8, 5, 1, 3��4
	 * ��һ�κ�increment��ֵ��Ϊ3/2=1,��ʱ��������в������� ʵ������Ӵ�С��
	 */

	public static void shellSort(int[] data) {
		int j = 0;
		int temp = 0;
		// ÿ�ν���������Ϊԭ����һ��
		for (int increment = data.length / 2; increment > 0; increment /= 2) {
			for (int i = increment; i < data.length; i++) {
				temp = data[i];
				for (j = i; j >= increment; j -= increment) {
					if (temp > data[j - increment]) // �����С������ֻ���޸�����
					{
						data[j] = data[j - increment];
					} else {
						break;
					}

				}
				data[j] = temp;
			}

		}
	}
	
	public static void main(String args[]) {
		int[] a = { 45, 37, 28, 11, 98, 67, 54, 22, 46, 9, 11 };
		shellSort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
