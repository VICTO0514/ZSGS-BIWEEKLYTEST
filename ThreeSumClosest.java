package biweeklyTest3;

import java.util.Arrays;

public class ThreeSumClosest {
	
	int threeSumClosest(int[] nums, int k) {
		
		Arrays.sort(nums);
		
		int result = nums[0] + nums[1] + nums[2];
		int min = Integer.MAX_VALUE;
		
		for(int i=0; i<nums.length - 2; i++) {
			
			int left = i + 1;
			int right = nums.length - 1;
			
			while(left < right) {
				
				int sum = nums[i] + nums[left] + nums[right];
				
				if(sum < k) {
					left++;
				}
				
				else {
					right--;
				}
				int diffTarget = Math.abs(sum - k);
				
				if(diffTarget < min) {
					result = sum;
					min = diffTarget;
				}
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		
		int[] nums = new int[] {-1,2,1,-4};
		int k = 1;
		
		ThreeSumClosest t = new ThreeSumClosest();
		System.out.println(t.threeSumClosest(nums, k));
	}

}
