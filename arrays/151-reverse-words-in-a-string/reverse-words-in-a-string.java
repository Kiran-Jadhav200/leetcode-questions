class Solution {
    public String reverseWords(String s) {
        //removes leading and trailing spaces
        s = s.trim();
        //split-> divide the string and puts element into array on the 
        //delimiter condition
       List<String>wordList =  Arrays.asList(s.split(" +"));
      // System.out.println(wordList);
       Collections.reverse(wordList);
       //System.out.println(wordList);
       return String.join(" ",wordList);
        
    }
}