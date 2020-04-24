package cn.acwing;

import java.util.Scanner;

public class �鲢���� {
	public int[] mergeSort(int[] arr) {
		sort(arr, 0, arr.length - 1);
		return arr;
	}

	private void sort(int[] arr, int left, int right) {
		if(left >= right) return;
		
		int mid = left + right >> 1;
//		System.out.println(arr[mid]);
		//��
		sort(arr, left, mid);
		sort(arr, mid+1, right);
		//��
		merge(arr, left, mid, right);
	}
	
	private void merge(int[] arr, int left, int mid, int right) {
		int[] sortedArray = new int[right - left + 1];
		int i = left, j = mid+1, k = 0;
		
		while(i <= mid && j <= right) {
			if(arr[i] <= arr[j]) {
				sortedArray[k ++] = arr[i];
				i ++;
			}else {
				sortedArray[k ++] = arr[j];
				j ++;
			}
		}
		while(i <= mid) {
			sortedArray[k ++] = arr[i ++];
		}
		while(j <= right) {
			sortedArray[k ++] = arr[j ++];
		}
		//���¸�ֵ��arr
		for (i = 0; i < sortedArray.length; i++) {
			arr[left+i] = sortedArray[i];
		}
	}

	public static void main(String[] args) {
		�鲢���� g = new �鲢����();
		Scanner sin = new Scanner(System.in);
		int n = sin.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sin.nextInt();
		}
		
		int[] out = g.mergeSort(arr);
		for (int i = 0; i < out.length; i++) {
			System.out.print(out[i] + " ");
		}
	}

}
