/*
 * Input: [-2,1,-3,4,-1,2,1,-5,4], Output: 6 Explanation: [4,-1,2,1] has the
 * largest sum = 6.
 */

class Solution {

	public int maxSubArray(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}

		int maxhere = nums[0], maxcont = 0;

		for (int i = 0; i < nums.length; i++) {
			maxcont += nums[i];
			if (nums[i] > maxcont) {
				maxcont = nums[i];
			}

			if (maxhere < maxcont) {
				maxhere = maxcont;
			}
		}
		return maxhere;
	}
}
