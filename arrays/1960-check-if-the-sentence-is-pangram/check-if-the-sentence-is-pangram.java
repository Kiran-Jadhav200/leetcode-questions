class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] alphabet = new int[26]; // Create an integer array to represent the count of each letter in the alphabet

        for (char c : sentence.toCharArray()) { // Iterate through each character in the sentence
            int index = Character.toLowerCase(c) - 'a'; // Calculate the index of the character in the alphabet array
            alphabet[index]++; // Increment the count at the corresponding index in the alphabet array
        }

        for (int count : alphabet) { // Iterate through each element in the alphabet array
            if (count == 0) { // If any letter is missing (count is 0), return false
                return false;
            }
        }

        return true; // If all letters are present (count > 0), return true
    }
}