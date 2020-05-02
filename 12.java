/*
 * Input: [2,7,4,1,8,1] Output: 1 Explanation: We combine 7 and 8 to get 1 so
 * the array converts to [2,4,1,1,1] then, we combine 2 and 4 to get 2 so the
 * array converts to [2,1,1,1] then, we combine 2 and 1 to get 1 so the array
 * converts to [1,1,1] then, we combine 1 and 1 to get 0 so the array converts
 * to [1] then that's the value of last stone.
 */

class Solution {
	public int lastStoneWeight(int[] stones) {
		if (stones.length == 1) {
			return stones[0];
		}
		Arrays.sort(stones);
		while (stones[stones.length - 2] != 0) {

			System.out.println(stones[stones.length - 1]);
			if (stones[stones.length - 1] == stones[stones.length - 2]) {
				stones[stones.length - 1] = 0;
				stones[stones.length - 2] = 0;
			} else {
				stones[stones.length - 1] = stones[stones.length - 1] - stones[stones.length - 2];
				stones[stones.length - 2] = 0;
			}
			Arrays.sort(stones);
		}

		return stones[stones.length - 1];
	}
}
