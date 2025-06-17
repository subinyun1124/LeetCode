class Solution {
    public int strStr(String haystack, String needle) {
        int answer = -1;
        if(haystack.contains(needle)){
            answer = haystack.indexOf(needle);
        }
        return answer;
    }
}