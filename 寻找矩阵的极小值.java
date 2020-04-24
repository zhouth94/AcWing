package cn.acwing;

public class 寻找矩阵的极小值 {
	//使用二分法，对矩阵的列进行二分
	public int[] getMinimumValue(int n) {
		int l = 0,r = n - 1;
		
		while(l < r) {
			//中间列
			int mid = (l + r) >> 1;
		
			int row = 0;
			int val = Integer.MAX_VALUE;
			//寻找中间列的极小值
			for (int i = 0; i < n; i++) {
				int tmp = query(i, mid);
				if(tmp < val) {
					val = tmp;
					//记录当前极小值所在的行索引
					row = i;
				}
			}
			
			//中间列的极小值与左右两边相邻的值进行比较
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
		
		//只剩下一列 l == r 寻找这一列中的极小值
		int row = 0;
		int val = Integer.MAX_VALUE;
		//寻找中间列的极小值
		for (int i = 0; i < n; i++) {
			int tmp = query(i, r);
			if(tmp < val) {
				val = tmp;
				//记录当前极小值所在的行索引
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
