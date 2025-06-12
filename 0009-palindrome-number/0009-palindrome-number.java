class Solution {
    public boolean isPalindrome(int x) {
        String strX = Integer.toString(x);
        if( x == 0) {
            return true;
        }

        for(int i = 0; i < strX.length()/2; i++) {
            int leftIdx = i;
            int rightIdx = strX.length() -1 -i;

            if(strX.charAt(leftIdx) != strX.charAt(rightIdx)){
                return false;
            }
        }
        return true;
    }
}