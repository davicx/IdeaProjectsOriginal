package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<String>();
        stringList.add("flower");
        stringList.add("flow");
        stringList.add("flight");

        System.out.println(longestPrefix(stringList));


    }

    public static String longestPrefix(ArrayList<String> stringList) {
        Set<Character> charSet = new HashSet<Character>();

        for(int i = 0; i < 4; i++) {

            for (String currentWord : stringList) {
                //System.out.println(currentWord.charAt(i));
                charSet.add(currentWord.charAt(i));
                System.out.println(charSet);
                if(charSet.size() == 1) {
                    System.out.println("still ok");
                } else {
                    System.out.println("too long");
                }
            }
            charSet.clear();

            System.out.println("_____");
    }


        return "answer";
    }

/*
   Set<String> hash_Set = new HashSet<String>();

        hash_Set.add("Geeks");
        hash_Set.add("For");
        hash_Set.add("Geeks");
        hash_Set.add("Example");
        hash_Set.add("Set");

        System.out.println(hash_Set);
 */
}
