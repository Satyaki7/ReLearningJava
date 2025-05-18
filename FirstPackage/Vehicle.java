package FirstPackage;
//INTERFACES
// This is a new concept so get definition from a book or something
// only public methods allowed

public interface Vehicle {

    final int gears = 5; //everyting in this will be constants that is final

    void changeGear(int a);

    void speedUp(int a); //completely abstract
    //this method will exist in any of the classes that will implement this

    void slowDown(int a);

    default void out(){
        System.out.println("Default method");

    }
    static int math(int b){
        return b+9;
    }
}
