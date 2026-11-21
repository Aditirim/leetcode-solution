//4117. Minimum Range After Sum Operations

class Solution {
    public int minRange(int a, int b, int c) {
        int min=Math.min(a,Math.min(b,c));
        int max=Math.max(a,Math.max(b,c));
        int dif=a+b+c-min-max;
        return Math.min(dif,max-min);
    }
}