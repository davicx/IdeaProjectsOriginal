import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //String s =  "abcabcbb";
        String s =  "abcad";
        //System.out.println(lengthOfLongestSubstringForce(s));
        System.out.println("ANSWER: " + lengthOfLongestSubstring(s));

    }



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


/*
         for (int i = 0; i < s.length(); i++) {
            Set<Character> uniqueCharSet = new HashSet<Character>();
            ArrayList<Character> allCharArray = new ArrayList<Character>();
            for (int j = i; j < s.length(); j++) {
                char c = s.charAt(j);
                uniqueCharSet.add(c);
                allCharArray.add(c);

                //Compare the List and the Set
                if(uniqueCharSet.size() != allCharArray.size()) {
                    System.out.println("Not Unique " + allCharArray + " | " + uniqueCharSet);
                    break;
                } else {
                    longestString = Math.max(longestString, uniqueCharSet.size()) ;
                    System.out.println("Still Unique " + allCharArray);
                }

            }

            System.out.println();
        }

 */



    public static int lengthOfLongestSubstringWhile(String s) {
        if(s == null || s.length() == 0) {
            return 0;
        }

        Set<Character> set = new HashSet<Character>();
        int max = 0;
        int i = 0;
        int j = 0;
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

        return max;

    }


    public static int lengthOfLongestSubstringForce(String s){
        int longestString = Integer.MIN_VALUE;
        if(s == null || s.length() == 0) {
            return 0;
        }

        for (int i = 0; i < s.length(); i++) {
            Set<Character> uniqueCharSet = new HashSet<Character>();
            ArrayList<Character> allCharArray = new ArrayList<Character>();
            for (int j = i; j < s.length(); j++) {
                char c = s.charAt(j);
                uniqueCharSet.add(c);
                allCharArray.add(c);

                //Compare the List and the Set
                if(uniqueCharSet.size() != allCharArray.size()) {
                    System.out.println("Not Unique " + allCharArray + " | " + uniqueCharSet);
                    break;
                } else {
                    longestString = Math.max(longestString, uniqueCharSet.size()) ;
                    System.out.println("Still Unique " + allCharArray);
                }

            }

            System.out.println();
        }

        return longestString;
    }

}

      /*
        int longestString = Integer.MIN_VALUE;
        Set<Character> uniqueCharSet = new HashSet<Character>();
        ArrayList<Character> charArray = new ArrayList<Character>();

        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);

            //Add Character to the set and list
            uniqueCharSet.add(c);
            charArray.add(c);

            //Compare the List and the Set
            if(uniqueCharSet.size() != charArray.size()) {
                System.out.println("Not Unique " + charArray + " | " + uniqueCharSet);
            } else {
                System.out.println("Still Unique " + charArray);
            }

            //System.out.println(c);

         */
