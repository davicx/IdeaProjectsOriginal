import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //String s =  "abcabcbb";
        String s =  "abac";
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

        }


    }
}
