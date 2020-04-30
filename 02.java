/*Input: 19
Output: true
Explanation: 
12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1*/

class Solution {
	
	public boolean isHappy(int n) {
	
		int sum = 0;
		int iteration = 0;
		while (sum != 1 && iteration < 10) {
			String num = String.valueOf(n);// n.toString();
			sum = 0;
			for (int i = 0; i < num.length(); i++) {
				sum += Integer.parseInt(String.valueOf(num.charAt(i)))
						* Integer.parseInt(String.valueOf(num.charAt(i)));
			}
			iteration++;
			n = sum;
		}

		System.out.println(sum + " : " + iteration);
		if (sum == 1 && iteration < 10) {
			return true;
		}
		return false;
	}
}
