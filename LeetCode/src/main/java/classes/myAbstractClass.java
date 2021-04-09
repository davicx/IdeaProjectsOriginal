package classes;

abstract class Archery {
    String bowType;

    //Default is Protected
    abstract void practiceBow();
    public void shootBow() {
        System.out.println("You shot your bow");
    }

}

class PracticeBow extends Archery {
    String bowType;

    //Constructor
    public PracticeBow(String bowType) {
        this.bowType = bowType;
    }

    @Override
    void practiceBow() {
        System.out.println("you Practiced shot your bow!");
    }
}


public class myAbstractClass {
    public static void main(String[] args) {
        PracticeBow myArcher = new PracticeBow("alder");
        myArcher.shootBow();
        myArcher.practiceBow();

    }


}
