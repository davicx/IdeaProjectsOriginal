package learning.random;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;


public class priorityQueueMap {

    public static void main(String[] args) {
        normalQueue();



    }

    public static void priorityQueue() {
        PriorityQueue<Integer> myQueue = new PriorityQueue<Integer>();
        Student david = new Student(1,"david", 14, 3.9);
        System.out.println(david.toString());

        /*
        PriorityQueue<String> myQueue = new PriorityQueue<String>();
        myQueue.add("b");
        myQueue.add("c");
        myQueue.add("a");
        myQueue.add("d");

        myQueue.add(1);
        myQueue.add(8);
        myQueue.add(3);
        myQueue.add(2);

        while(!myQueue.isEmpty()) {
            System.out.println(myQueue);
            System.out.println(myQueue.poll());
        }
        */


    }

    public static void priorityQueueExample() {
        //Queue<E> queue = new PriorityQueue<E>(c);


    }



    public static void normalQueue() {
        Queue<Integer> nums = new LinkedList<Integer>();
        nums.offer(1); //Prevent errors returns true or false
        nums.add(2);
        nums.add(3);
        nums.add(4);
        //System.out.println(nums.peek());
        //System.out.println(nums.element());
        //System.out.println();
        while(nums.size() > 0) {
            //System.out.println(nums.remove());
            System.out.println(nums.poll());
        }
        System.out.println(nums.poll());
        System.out.println(nums.peek());

    }


}
