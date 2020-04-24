package cn.acwing;

import java.util.Arrays;

public class �����������в���Ԫ�صĵ�һ�������һ��λ�� {
	public int[] searchRange(int[] nums, int target) {
        int l = 0, r = nums.length -1 ;
        while(l < r) {
            int mid = l + r + 1>> 1;
            if(nums[mid] <= target) { //���������
                l = mid;
            }else {
                r = mid - 1;
            }
        }
        if(nums[l] != target) {
            return new int[]{-1,-1};
        }else {
            int[] res = new int[2];
            res[0] = l;
            l = 0; r = nums.length - 1;
            while(l < r) {
                int mid = l + r >> 1;
                if(nums[mid] >= target)
                    r = mid;
                else
                    l = mid + 1;
            }
            res[1] = l;
            return res;
        }
    }
	
	public static void main(String[] args) {
		�����������в���Ԫ�صĵ�һ�������һ��λ�� z = new �����������в���Ԫ�صĵ�һ�������һ��λ��();
		int[] res = z.searchRange(new int[]{5,7,7,8,8,10}, 8);
		System.out.println(Arrays.toString(res));
		
	}

}
