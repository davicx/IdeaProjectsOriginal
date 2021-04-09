package learning.random;

public class MainThread {
    public static void main(String args[]) throws Exception {
        MyThreadState thrd = new MyThreadState();
        thrd.setName("MyThread #1");
        showThreadStatus(thrd);

        thrd.start();
        Thread.sleep(50);
        showThreadStatus(thrd);

        thrd.waiting = false;
        Thread.sleep(50);
        showThreadStatus(thrd);

        thrd.notice();
        Thread.sleep(50);
        showThreadStatus(thrd);

        while(thrd.isAlive())
            System.out.println("alive");
        showThreadStatus(thrd);
    }
    static void showThreadStatus(Thread thrd) {
        System.out.println(thrd.getName()+" Alive:"+thrd.isAlive()+" State:" + thrd.getState() );
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
        //Simple Array
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        int[] myNum = {10, 20, 30, 40};
        char[] inputString = {'h','e','l','l','o'};

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


        //PART 4: Control Statements
        //If Statements
        if (1 == 1) {
            System.out.println("One is one");
        } else {
            System.err.println("Nope");
        }
           */
//For Loop
        /*
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        */
//Recursion
