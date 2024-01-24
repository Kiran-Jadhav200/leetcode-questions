class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] alphabet = new boolean[26];

        for(char c : sentence.toCharArray()){
            int index = Character.toLowerCase(c) - 'a';

            alphabet[index] = true;

        }
        for(boolean letter: alphabet){
            if(!letter){
                return false;
            }
        }
        return true;
    }
}