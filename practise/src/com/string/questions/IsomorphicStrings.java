package com.string.questions;

import java.util.HashMap;
import java.util.Map;

/**
 *  Question: 
 * Given two strings s and t, determine if they are isomorphic.
 * Two strings are isomorphic if the characters in s can be replaced to get t.
 * For example,"egg" and "add" are isomorphic, "foo" and "bar" are not.
 *
 * Best Solution: O(1) space and O(n) time
 *
 *
 * Tips & Tricks:
 * 1. 
 */
public class IsomorphicStrings {
    public static void main(String [] args) {
        String s = "egg";
        String t= "add";
        System.out.println(isIsomorphic(s,t));
    }


    public static boolean isIsomorphic(String s, String t) {
        if (s == null || t == null ){
            return false;
        }

        if (s.length() == 0 || t.length() == 0) {
            return false;
        }

        Map<Character, Character> map = new HashMap<>();

        for (int i=0; i <s.length()-1; i++) {
            Character c1 = s.charAt(i);
            Character c2 = t.charAt(i);

            if (map.containsKey(c1)) {
                if (map.get(c1)!= c2) {
                    return false;
                }
            } else {
                if (map.containsValue(c2)){
                    return false;
                }
                map.put(c1,c2);
            }
        }
        return true;
    }
}
