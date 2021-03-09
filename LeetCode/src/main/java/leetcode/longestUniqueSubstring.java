package leetcode;

import java.util.HashSet;
import java.util.Set;

public class longestUniqueSubstring {
    public static void main(String[] args) {
        String s =  "abccd";
        System.out.println("ANSWER: " + lengthOfLongestSubstring(s));
        //lengthOfLongestSubstring(s);
    }

    public static int lengthOfLongestSubstring(String s) {
        if(s == null || s.length() == 0) {
            return 0;
        }
        int longestSubString = 0;
        int leftPointer = 0;
        int rightPointer = 0;
        Set<Character> charSet = new HashSet<Character>();
        char c;

        for (rightPointer = 0; rightPointer < s.length(); rightPointer++) {
            c = s.charAt(rightPointer);

            //While we have seen this move the left pointer
            while(charSet.contains(c)){
                charSet.remove(s.charAt(leftPointer));
                leftPointer = leftPointer + 1;

            }
            charSet.add(c);
            longestSubString = Math.max(longestSubString, charSet.size());
            System.out.println("LEFT: " + leftPointer + " RIGHT: " + rightPointer + " MAX: " + longestSubString + " CURRENT " +  charSet.size());
            System.out.println(charSet);
        }

        return longestSubString;

    }





    /*
          while(i < s.length()) {
            char c = s.charAt(i);

            while(set.contains(c)) {
                set.remove(s.charAt(j));
                ++j;
            }
            set.add(c);
            max = Math.max(max, i-j+1);
            ++i;
        }
     */


}


/*
    public static int lengthOfLongestSubstring(String s) {
        int longestSubString = 0;
        int leftPointer = 0;
        int rightPointer = 0;
        char c;

        for (rightPointer = 0; rightPointer < s.length(); rightPointer++) {
            Set<Character> charSet = new HashSet<Character>();
            c = s.charAt(rightPointer);
            charSet.add(c);
            System.out.println(rightPointer +  " " + leftPointer +  " " + c);
            if(charSet.contains(c)) {
                System.out.println("Found ");
                charSet.remove(s.charAt(leftPointer));
                ++leftPointer;
            }

            longestSubString = Math.max(longestSubString, rightPointer-leftPointer+1);
            ++rightPointer;

        }
        return longestSubString;
    }

 */