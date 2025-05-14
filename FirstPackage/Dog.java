package FirstPackage;

public class Dog {

    protected static int count = 0; // need more understanding .
    // private String name;
    // private int age; // The private keyword ensures that the variable is only accessible within this class // only us this for within the class operation.
    public String name; // using public so that the inherited classes can see these variables.
    public int age;
    //USE PROTECT WHEN YOU NEED : Only things withing the same package or subclasses of this class can access this variable. Other packages wil not be able to access this

    //constructor
    public Dog(String name, int age) {
        this.name = name;
        this.age = age; // this. finds the private attribute of the class.
    }

    public void speak() {
        System.out.println("I am " + this.name + " and i am " + this.age + "years old");
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int add2() {
        return this.age = 2;
    }
}
