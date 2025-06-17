class Solution {
    public int lengthOfLastWord(String s) {
        int answer = 0;
    
        String[] words = s.split(" ");
        for(int i = 0; i < words[words.length -1].length(); i++) {
            answer += 1;
        }
        return answer;
    }
}