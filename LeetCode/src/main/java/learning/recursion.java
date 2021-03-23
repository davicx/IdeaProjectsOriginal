package learning;

import java.util.ArrayList;

public class recursion {
    public static void main(String[] args) {
        //String s = "abcdcba";
        String s = "abc";
        int l = s.length();
        int n = 0;
        recursionStringRight(s, l, n);

        //int middle = 4 / 2;
        //int remainder = 4 % 2;

        //int middle = l / 2;
        //int remainder = l % 2;

        //System.out.println(middle + " " + remainder + " " + s.charAt(middle));


    }

    public static void recursionStringRight(String s, int l, int n) {
        if (n == l) {
            System.out.println("Done");
        } else {
            System.out.println(s.charAt(n));
            n = n + 1;
            recursionStringLoop(s, l, n);
        }
    }

    public static void recursionStringLoop(String s, int l, int n) {
        if (n == l) {
            System.out.println("Done");
        } else {
            System.out.println(s.charAt(n));
            n = n + 1;
            recursionStringLoop(s, l, n);
        }
    }

    public static void sayHi(int n) {
        if (n == 0) {
            System.out.println("Done");
        } else {
            System.out.println("hi " + n);
            n = n - 1;
            sayHi(n);
        }
    }

    public static void recursionOutward(int n) {
        String s = "abcdcba";
        int middle = s.length() / 2;
        int leftBoundary = 0;
        int rightBoundary = s.length();
        int step = 1;
        char leftChar;
        char rightChar;
        System.out.println("MIDDLE " + s.charAt(middle));

        while(step < 10) {
            //System.out.println(step);
            if(middle - step < leftBoundary || middle + step > rightBoundary) {
                System.out.println("no luck");
                break;
            } else {
                leftChar = s.charAt(middle - step);
                rightChar = s.charAt(middle + step);
                System.out.println("LEFT: " + leftChar + " RIGHT: " + rightChar);
                if(leftChar == rightChar) {
                    System.out.println("Palindrome ");
                }
            }
            step = step + 1;
        }

        /*
        //ONE STEP
        //Check Left and Right Boundaries
        if(middle - 1 < leftBoundary || middle + 1 > rightBoundary) {
            System.out.println("no luck");
        } else {
            System.out.println("LEFT: " + s.charAt(middle - 1) + " RIGHT: " + s.charAt(middle + 1));
        }

        //TWO STEPS
        if(middle - 2 < leftBoundary || middle + 2 > rightBoundary) {
            System.out.println("no luck");
        } else {
            System.out.println("LEFT: " + s.charAt(middle - 2) + " RIGHT: " + s.charAt(middle + 2));
        }

        //THREE STEPS
        if(middle - 3 > leftBoundary || middle + 3 < rightBoundary) {
            System.out.println("LEFT: " + s.charAt(middle - 3) + " RIGHT: " + s.charAt(middle + 3));
        } else {
            System.out.println("no luck");
        }
        */

    }



    public static void simple() {
        String s = "abcba";
        int middle = 2;
        int leftBoundary = 0;
        int rightBoundary = s.length();

        //Middle
        System.out.println(s.charAt(middle));

        //ONE STEP
        //Check Left and Right Boundaries
        if(middle - 1 < leftBoundary || middle + 1 > rightBoundary) {
            System.out.println("no luck");
        } else {
            System.out.println("LEFT: " + s.charAt(middle - 1) + " RIGHT: " + s.charAt(middle + 1));
        }

        //TWO STEPS
        if(middle - 2 < leftBoundary || middle + 2 > rightBoundary) {
            System.out.println("no luck");
        } else {
            System.out.println("LEFT: " + s.charAt(middle - 2) + " RIGHT: " + s.charAt(middle + 2));
        }

        //THREE STEPS
        if(middle - 3 > leftBoundary || middle + 3 < rightBoundary) {
            System.out.println("LEFT: " + s.charAt(middle - 3) + " RIGHT: " + s.charAt(middle + 3));
        } else {
            System.out.println("no luck");
        }

    }


    public static void nameArray(ArrayList<String> friends, int friendsSize, int count) {
        /*
        //Call
        ArrayList<String> friends = new ArrayList<String>();
        friends.add("bilbo");
        friends.add("david");
        friends.add("sam");
        friends.add("frodo");
        int friendsSize = friends.size();
        int count = 0;
        nameArray(friends, friendsSize, count);

        if (count == friendsSize) {
            System.out.println("All the people");
        } else {
            System.out.println(friends.get(count) + " " + count);
            count = count + 1;
            nameArray(friends, friendsSize, count);
        }

         */

    }





}

