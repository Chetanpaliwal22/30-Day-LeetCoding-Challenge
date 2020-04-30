//Input: [2,2,1]
//Output: 1

class Solution {
	public int singleNumber(int[] nums) {

		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

		for (int i = 0; i < nums.length; i++) {
			if (hashMap.containsKey(nums[i])) {
				hashMap.remove(nums[i]);
			} else {
				hashMap.put(nums[i], 1);
			}
		}
		for (Integer key : hashMap.keySet()) {
			return key;
		}
		return 0;
	}
}
