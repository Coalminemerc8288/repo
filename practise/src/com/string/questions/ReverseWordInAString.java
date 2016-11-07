package com.string.questions;


/**
 *  Question: 
 * Given an input string, reverse the string word by word. A word is defined as a sequence of non-space characters.
 * The input string does not contain leading or trailing spaces and the words are always separated by a single space.
 * For example,Given s = "the sky is blue",
 * return "blue is sky the".
 *
 * Best Solution: O(1) space and O(n) time
 *
 * Output:
 * eht yks si blue
 * eht yks si eulb
 * blue is sky the
 *
 *
 * Tips & Tricks:
 * 1. Build reverse function that take two edges and swaps the elements(works for both word or big string)
 * 2. Reverse individual word by word till the end of the string
 * 3. Reverse the complete  char array from 1st to last (swapping two edges)
 */
public class ReverseWordInAString {

    public static void main(String[] args) {
        String s = "the sky is blue";

        reverseWords(s.toCharArray());
    }

    public static void reverseWords(char[] s) {
        int i = 0;
        for (int j =0; j< s.length; j++) {
            if (s[j] == ' ') {
                reverse(s, i, j - 1);
                i = j + 1;
            }
        }

        reverse(s, i, s.length-1);

        reverse(s, 0, s.length-1);

        System.out.println(s);
    }

    public static void reverse(char[] s, int i, int j) {
        while (i<j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }
}
