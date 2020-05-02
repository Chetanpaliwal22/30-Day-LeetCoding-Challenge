/*Input: [0,1]
Output: 2
Explanation: [0, 1] is the longest contiguous subarray with equal number of 0 and 1.
Example 2:
Input: [0,1,0]
Output: 2
Explanation: [0, 1] (or [1, 0]) is a longest contiguous subarray with equal number of 0 and 1.
*/

class Solution {
	public int findMaxLength(int[] nums) {

		int maxlen = 0;
		int len = nums.length;
		for (int i = 0; i < len; i++) {
			int zcount = 0;
			int ocount = 0;
			for (int j = i; j < len; j++) {
				if (nums[j] == 0) {
					zcount++;
				} else {
					ocount++;
				}

				if (zcount == ocount) {
					maxlen = Math.max(maxlen, zcount + ocount);
				}

			}
		}
		return maxlen;
	}
}
