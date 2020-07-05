class Solution {
    public int arrangeCoins(int n) {
        int index = 0;
        while(n >= 0){
            index++;
            n=n-index;
        }
        return index-1;
    }
}
