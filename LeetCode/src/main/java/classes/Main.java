package classes;

public class Main {
    public static void main(String[] args) {


        String myString = "hi";

        User currentUser = new User(1, "Davey");
        User userFriend = new User(2, "Bilbo");

        //boolean result = currentUser.getClass().equals( userFriend.getClass());
        currentUser.addFriend("bilbo");
        currentUser.addFriend("frodo");

        //System.out.println(currentUser.getFriends());

        //Inheritance
        Parent parentClass = new Parent(1);
        Child childClass = new Child("My parent has ID 2", 2);
        //System.out.println(parentClass.userID);
        //System.out.println(childClass.parentsName);
        //childClass.sayHello("davey");
        //childClass.sayHello();

        //Interface
        runningInterface myRunningInterface = new runningInterface("Get in Shape ");
        myRunningInterface.whereWillWeGo("The Mountains");
        System.out.println(myRunningInterface.run);
    }


    //Interface (Remove Static from another class)
    public static class runningInterface implements InterfaceRun {
        String myGoal;

        //Constructor
        public runningInterface(String myGoal) {
            this.myGoal = myGoal;
        }

        @Override
        public void whereWillWeGo(String destination) {
            System.out.println("We will go to " + destination);

        }

        @Override
        public String runRoute(String route) {
            String theRoute = "The route we are going on is " + route;
            return theRoute;
        }
    }





}
