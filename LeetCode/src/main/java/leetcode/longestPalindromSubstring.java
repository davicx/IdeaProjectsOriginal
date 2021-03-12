package leetcode;

import java.util.ArrayList;

public class longestPalindromSubstring {
    public static void main(String[] args) {
        String s = "abad";
        //System.out.println("ANSWER: " + longestPalindrome(s));
        ArrayList<String> friends = new ArrayList<String>();
        friends.add("bilbo");
        friends.add("david");
        friends.add("sam");
        friends.add("frodo");
        System.out.println(friends);



    }

    public static int longestPalindrome(String s) {


        return 1;
    }
}


        /*
        char currentChar;
        char leftChar;
        char rightChar;
        int leftIndex;
        int rightIndex;

        boolean currentPalindrome = true;
        boolean outOfBounds = false;
        int longestPalindrome = 0;
        int stringLength = s.length() - 1;

        for (int i = 0; i < s.length(); i++) {
            currentChar = s.charAt(i);

            System.out.println("Currently At Char: " + s.charAt(i) + " Loop " + i + " Boolean " + outOfBounds);
            leftIndex = i -1;
            rightIndex = i + 1;
            System.out.println("leftIndex " + leftIndex + " rightIndex " + rightIndex);

            if(leftIndex < 0) {
                System.out.println("OVERFLOW LEFT ");
            }

            if(rightIndex > stringLength) {
                System.out.println("OVERFLOW RIGHT ");
            }


            while(outOfBounds == false) {
                System.out.println("Enter While Loop " + i);


                if((leftIndex < 0) || (rightIndex > s.length()-1)) {
                    outOfBounds = true;
                    //System.out.println("out of bounds");
                } else {
                    outOfBounds = false;
                    //System.out.println("ok");
                }
            }


            System.out.println();

        }
            return longestPalindrome;

   */



        /*

        for (int i = 0; i < s.length(); i++) {
            currentChar = s.charAt(i);
            System.out.println("Currently At Char: " + s.charAt(i)  + " Loop " + i);

            //Loop Over
            leftIndex = i -1;
            rightIndex = i + 1;

            while(outOfBounds == false && currentPalindrome == true) {
                System.out.println("in while loop");
                longestPalindrome = 1;

                //Check for Out of Bounds
                if((leftIndex < 0) || (rightIndex > s.length()-1)) {
                    outOfBounds = true;
                    System.out.println("out of bounds");
                } else {
                    System.out.println("ok");

                    //Check for Palindrome
                    leftIndex = s.charAt(i-1);
                    rightIndex = s.charAt(i+1);
                    if(leftIndex == rightIndex) {
                        currentPalindrome = true;
                        longestPalindrome = longestPalindrome + 2;
                    } else {
                        currentPalindrome = false;
                        longestPalindrome = 0;
                    }
                    outOfBounds = false;

                }
            }
        }
        */

