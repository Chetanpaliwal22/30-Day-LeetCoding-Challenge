/*Input:
11110
11010
11000
00000

Output: 1

Input:
11000
11000
00100
00011

Output: 3*/

class Solution {
	public int numIslands(char[][] grid) {

		int m = grid.length;
		if (grid == null || m == 0) {
			return 0;
		}
		int n = grid[0].length;

		int count = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {

				if (grid[i][j] == '1') {
					count++;
					bfs(grid, i, j);
				}
			}
		}
		return count;
	}

	public void bfs(char[][] grid, int i, int j) {

		int m = grid.length;
		int n = grid[0].length;

		if (grid[i][j] == '0') {
			return;
		}

		grid[i][j] = '0';

		if (i - 1 >= 0) {
			bfs(grid, i - 1, j);
		}

		if (j - 1 >= 0) {
			bfs(grid, i, j - 1);
		}

		if (i + 1 < m) {
			bfs(grid, i + 1, j);
		}
		if (j + 1 < n) {
			bfs(grid, i, j + 1);
		}
	}

}
