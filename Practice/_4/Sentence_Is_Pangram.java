package com.Practice._4;

//1832. Check if the Sentence Is Pangram
//        A pangram is a sentence where every letter of the English alphabet appears at least once.
//        Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.
//
//
//        Example 1:
//        Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
//        Output: true
//        Explanation: sentence contains at least one of every letter of the English alphabet.
//
//        Example 2:
//        Input: sentence = "leetcode"
//        Output: false

public class Sentence_Is_Pangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog".replaceAll("\\s","");
        System.out.println(Pangram(sentence));
    }

    static boolean Pangram(String sentence) {
        boolean ans = true;
        for (char i = 'a'; i <= 'z'; i++) {
            ans = false;
            for (int j = 0; j < sentence.length(); j++) {
                if(sentence.charAt(j) == i || sentence.charAt(j) == Character.toUpperCase(i)) {
                    ans = true;
                    break;
                }
            }
            if(!ans) {
                return ans;
            }
        }

        return ans;
    }
}
