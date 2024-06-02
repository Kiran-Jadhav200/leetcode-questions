class Solution {
    public int scoreOfString(String s) {
      int score = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int difference = Math.abs(s.charAt(i) - s.charAt(i + 1));
            score += difference;
        }
        return score;
        
    }
}