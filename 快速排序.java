package cn.acwing;

import java.util.Scanner;

public class 快速排序 {
	public int[] quickSort(int[] arr) {
		sort(arr, 0, arr.length - 1);
		return arr;
	}
	
	private void sort(int[] arr, int left, int right) {
		if(left >= right) return; //递归终止条件
		int standard = arr[left];
		int i = left;
		int j = right;
		
		while(i < j) {
			while(arr[j] >= standard && i < j) {
				j --;
			}
			
			while(arr[i] <= standard && i < j) {
				i ++;
			}
			if(i < j) {
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
		arr[left] = arr[i];
		arr[i] = standard;
		sort(arr, left, i-1);
		sort(arr, i+1, right);
	}

	public static void main(String[] args) {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sin = new Scanner(System.in);
		int n = sin.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sin.nextInt();
		}
		快速排序 k = new 快速排序();
		int[] res = k.quickSort(arr);
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}
	}

}
