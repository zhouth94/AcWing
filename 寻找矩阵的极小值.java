package cn.acwing;

public class Ѱ�Ҿ���ļ�Сֵ {
	//ʹ�ö��ַ����Ծ�����н��ж���
	public int[] getMinimumValue(int n) {
		int l = 0,r = n - 1;
		
		while(l < r) {
			//�м���
			int mid = (l + r) >> 1;
		
			int row = 0;
			int val = Integer.MAX_VALUE;
			//Ѱ���м��еļ�Сֵ
			for (int i = 0; i < n; i++) {
				int tmp = query(i, mid);
				if(tmp < val) {
					val = tmp;
					//��¼��ǰ��Сֵ���ڵ�������
					row = i;
				}
			}
			
			//�м��еļ�Сֵ�������������ڵ�ֵ���бȽ�
			long leftVal = (mid > 0)? query(row, mid-1) : Integer.MAX_VALUE;
			long rightVal = (mid + 1 < n)? query(row,mid+1) : Integer.MAX_VALUE;
			
			if(val < leftVal && val < rightVal) {
				return new int[]{row, mid};
			}
			if(leftVal < val) {
				r = mid - 1;
			}
			else {
				l = mid + 1;
			}
		}
		
		//ֻʣ��һ�� l == r Ѱ����һ���еļ�Сֵ
		int row = 0;
		int val = Integer.MAX_VALUE;
		//Ѱ���м��еļ�Сֵ
		for (int i = 0; i < n; i++) {
			int tmp = query(i, r);
			if(tmp < val) {
				val = tmp;
				//��¼��ǰ��Сֵ���ڵ�������
				row = i;
			}
		}
		return new int[]{row, r};
	}

	private int query(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}

}
