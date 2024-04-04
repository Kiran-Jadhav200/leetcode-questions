class Solution {
    public boolean isPalindrome(String s) {
        String fixedString = "";
        for(char c: s.toCharArray()){
            if(Character.isDigit(c) || Character.isLetter(c)){
                fixedString += c;
            }
        }
        fixedString = fixedString.toLowerCase();

        int left = 0;
        int right = fixedString.length()-1;
        while(left <= right){
            if(fixedString.charAt(left) != fixedString.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}