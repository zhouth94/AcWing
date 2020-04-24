package cn.acwing;

import java.util.Arrays;

public class 在排序数组中查找元素的第一个和最后一个位置 {
	public int[] searchRange(int[] nums, int target) {
        int l = 0, r = nums.length -1 ;
        while(l < r) {
            int mid = l + r + 1>> 1;
            if(nums[mid] <= target) { //必须二段性
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
		在排序数组中查找元素的第一个和最后一个位置 z = new 在排序数组中查找元素的第一个和最后一个位置();
		int[] res = z.searchRange(new int[]{5,7,7,8,8,10}, 8);
		System.out.println(Arrays.toString(res));
		
	}

}
