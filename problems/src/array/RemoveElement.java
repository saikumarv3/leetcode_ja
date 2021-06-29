package array;

import java.util.Arrays;

public class RemoveElement {
	public static void main(String args[]) {
		int[] nums = { 2, 2, 3, 6, 4, 2, 7 };
		int val = 2;
		new RemoveElement().removeElement(nums, val);
		System.out.println(Arrays.toString(nums));
		for (int a = 0; a < nums.length; a++) {
			System.out.println(nums[a]);
		}
	}

	public int removeElement(int[] nums, int val) {
		int i = 0;
	    for (int j = 0; j < nums.length; j++) {
	        if (nums[j] != val) {
	            nums[i] = nums[j];
	            i++;
	        }
	    }
	    return i;
		
		//another solution
//		int i = 0;
//		int n = nums.length;
//		while (i < n) {
//			if (nums[i] == val) {
//				nums[i] = nums[n - 1];
//				// reduce array size by one
//				n--;
//			} else {
//				i++;
//			}
//		}
//		return n;
	}
}
