package cn.acwing;

public class Ë«Ö¸Õë_Êä³öµ¥´Ê {
	//O(n)
	public static void main(String[] args) {
		String strs = "abc def hij";
		int len = strs.length();
		for(int i = 0;i < len;i ++) {
			int j = i;
			while(j < len && strs.charAt(j) != ' ') {
				j ++;
			}
			for(int k = i;k < j;k ++) {
				System.out.print(strs.charAt(k));
			}
			System.out.println();
			i = j;
		}
		
	}

}
