/*
 * Input: ["eat", "tea", "tan", "ate", "nat", "bat"], Output: [
 * ["ate","eat","tea"], ["nat","tan"], ["bat"] ]
 */

class Solution {
	public List<List<String>> groupAnagrams(String[] strs) {

		HashMap<String, List<String>> anaGroup = new HashMap<String, List<String>>();

		for (int i = 0; i < strs.length; i++) {
			char[] charArr = strs[i].toCharArray();
			Arrays.sort(charArr);
			if (anaGroup.containsKey(new String(charArr))) {
				anaGroup.get(new String(charArr)).add(strs[i]);
			} else {
				List<String> list = new ArrayList<String>();
				list.add(strs[i]);
				anaGroup.put(new String(charArr), list);
			}
		}
		return new ArrayList<>(anaGroup.values());
	}
}
