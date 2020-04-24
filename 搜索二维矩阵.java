package cn.acwing;

public class ËÑË÷¶þÎ¬¾ØÕó {
	public boolean searchMatrix(int[][] matrix, int target) {
		if(matrix.length == 0 || matrix == null)
			return false;
		
		int rows = matrix.length;
		int cols = matrix[0].length;
		
		int row = rows - 1, col = 0;
		while(row >= 0 && col < cols) {
			if(matrix[row][col] > target) {
				row --;
			}else if(matrix[row][col] > target) {
				col ++;
			}else {
				return true;
			}
		}
		return false;
	}
	
	public boolean searchMatrix_2(int[][] matrix, int target) {
		if(matrix.length == 0 || matrix == null || matrix[0].length == 0)
			return false;
		
		int rows = matrix.length;
		int cols = matrix[0].length;
		
		int l = 0, r = rows * cols - 1;
		while(l < r) {
			int mid = l + r >> 1;
			if(matrix[mid / cols][mid % cols] >= target) {
				r = mid;
			}else {
				l = mid + 1;
			}
		}
		if(matrix[l / cols][l % cols] != target)
			return false;
		return true;
	}

}
