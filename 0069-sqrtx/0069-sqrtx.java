class Solution {
    public int mySqrt(int x) {
        int answer = 0;

        double sqrtNum = Math.sqrt(x);
        answer = (int) sqrtNum;

        return answer;
    }
}