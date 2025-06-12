class Solution {
    public int romanToInt(String s) {
        int answer = 0;
        int i = 0;

        while (i < s.length()) {
            if (i < s.length() - 1) {
                if (s.charAt(i) == 'I' && s.charAt(i + 1) == 'V') {
                    answer += 4;
                    i += 2;
                    continue;
                } else if (s.charAt(i) == 'I' && s.charAt(i + 1) == 'X') {
                    answer += 9;
                    i += 2;
                    continue;
                } else if (s.charAt(i) == 'X' && s.charAt(i + 1) == 'L') {
                    answer += 40;
                    i += 2;
                    continue;
                } else if (s.charAt(i) == 'X' && s.charAt(i + 1) == 'C') {
                    answer += 90;
                    i += 2;
                    continue;
                } else if (s.charAt(i) == 'C' && s.charAt(i + 1) == 'D') {
                    answer += 400;
                    i += 2;
                    continue;
                } else if (s.charAt(i) == 'C' && s.charAt(i + 1) == 'M') {
                    answer += 900;
                    i += 2;
                    continue;
                }
            }

            // 일반 문자일 경우
            if (s.charAt(i) == 'I') {
                answer += 1;
            } else if (s.charAt(i) == 'V') {
                answer += 5;
            } else if (s.charAt(i) == 'X') {
                answer += 10;
            } else if (s.charAt(i) == 'L') {
                answer += 50;
            } else if (s.charAt(i) == 'C') {
                answer += 100;
            } else if (s.charAt(i) == 'D') {
                answer += 500;
            } else if (s.charAt(i) == 'M') {
                answer += 1000;
            }

            i++;
        }

        return answer;
    }
}