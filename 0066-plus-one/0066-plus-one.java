class Solution {
    public int[] plusOne(int[] digits) {

        // int num = 0;
        // for(int i = 0; i < digits.length; i++) {
        //     num += digits[i] * Math.pow(10, digits.length -1 - i);
        // }

        // String strNum = Integer.toString(num+1);
        // int[] answer = new int[strNum.length()];

        // for(int i=0; i<strNum.length(); i++) {
        //     answer[i] = strNum.charAt(i) - '0';
        // }

        // return answer;

        int n = digits.length;

        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }

        int[] result = new int[n + 1];
        result[0] = 1;
        return result;
    }
}