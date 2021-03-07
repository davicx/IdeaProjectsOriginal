public class Master {
    public static void main(String[] args) {
        //String s =  "abcabcbb";
        String s =  "abcd";
        loopOverString(s);

    }

    public static int loopOverString(String s){
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                char c = s.charAt(j);
                System.out.print(c);
            }
            System.out.println();
        }

        return 1;
    }
}
