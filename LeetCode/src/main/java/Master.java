import java.util.*;

public class Master {
    public static void main(String[] args) {

        //PART 1: Primitives
        boolean result = true;
        char capitalC = 'C';
        byte b = 100;
        short s = 10000;
        int a = 0;

        //PART 2: Arrays
        //Simple Array
        String[] usersEmpty;
        String usersTen[] = new String[10];
        String[] users = {"Bilbo", "Frodo", "David"};

        //Array List
        ArrayList<String> userArrayList = new ArrayList<String>();
        userArrayList.add("davey");

        //PART 3: Control Statements
        //For Loop
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        //If Statements
        if (1 == 1) {
            System.out.println("One is one");
        } else {
            System.err.println("Nope");
        }

        //While Loop
        while (a < 5) {
            System.out.println(a);
            a++;
        }


        //PART 4: Data Structures
        //Hash Map
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "david");

        map.entrySet().forEach(entry->{
            System.out.println(entry.getKey() + " " + entry.getValue());
        });

        Map<String, Integer> mapCounter = new HashMap<>();
        mapCounter.put("david", mapCounter.getOrDefault("david", 0)+ 1);
        mapCounter.put("david", mapCounter.getOrDefault("david", 0)+ 1);
        mapCounter.put("frodo", mapCounter.getOrDefault("frodo", 0)+ 1);
        System.out.println(mapCounter);

        //Hash Set
        Set<String> stringSet = new HashSet<String>();
        stringSet.add("hiya");
        stringSet.contains("hiya");
        System.out.println(stringSet);


    }


    //loopOverString(s);
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

/*






        int[] nums = {2, 7, 11, 15, 2, 3, 4, 2, 4};

        ArrayList<Integer> millionInts = new ArrayList<Integer>();
        Random rand = new Random();
        int currentNumber = 0;

        for (int j = 0; j<1000000; j++) {
            currentNumber = rand.nextInt(50);
            //System.out.println(currentNumber);
            millionInts.add(currentNumber);

        }

        //System.out.println(millionInts.size());
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < millionInts.size(); i++) {
            map.put(millionInts.get(i), map.getOrDefault(millionInts.get(i), 0)+ 1);
        }




        map.entrySet().forEach(entry->{
            System.out.println(entry.getKey() + " " + entry.getValue());
        });



        /*
        //PART 3: Data Structures


        //Loop over array

        int[] myArray = {2,7,11,15};
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }


        //Hash Map
        int[] nums = {2, 7, 11, 15};
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        map.entrySet().forEach(entry->{
            System.out.println(entry.getKey() + " " + entry.getValue());
        });

*/
