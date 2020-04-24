package cn.acwing;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 逆序对的数量 {
	/**
	 * Time Limit Exceeded   
	 * @param args
	 */
	public static void main(String[] args) throws Exception{
//		Scanner sin = new Scanner(new BufferedInputStream(System.in));
		// 输入数据进行初始化
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line1 = reader.readLine();
        if(("").equals(line1) || line1==null) {
        	return ;
        }
		int n = Integer.parseInt(line1);
		
		String line2 = reader.readLine();
		if(("").equals(line2) || line2==null) {
        	return ;
        }
		String[] strs = line2.split(" ");
		
		int[] tar = new int[n];
		for (int i = 0; i < n; i++) {
			tar[i] = Integer.parseInt(strs[i]);
			System.out.print(tar[i] + " ");
		}
		
		long out = mergeSort(tar, 0, n - 1);
		System.out.println(out);
		reader.close();
	}

	private static long mergeSort(int[] tar, int l, int r) {
		if(l >= r)
			return 0;
		
		int mid = l + r >> 1;
		long res = mergeSort(tar, l, mid) + mergeSort(tar, mid + 1, r);
		//归并,治
		int i = l, j = mid + 1, k = 0; 
		int[] tmp = new int[tar.length];
		while(i <= mid && j <= r) {
			if(tar[i] <= tar[j]) 
				tmp[k ++] = tar[i ++];
			else {
				tmp[k ++] = tar[j ++];
				res += mid - i + 1;
			}
		}
		while(i <= mid)
			tmp[k ++] = tar[i ++];
		while(j <= r)
			tmp[k ++] = tar[j ++];
		
		for (i = l,k = 0; i <= r; i ++,k ++) {
			tar[i] = tmp[k];
		}
		return res;
		
	}

}
