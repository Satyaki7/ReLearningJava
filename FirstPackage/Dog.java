package FirstPackage;

public class Dog {

    protected static int count = 0; // will be formed once. Which is true for every object. That is for every object that one variable will be altered.
    // private String name;
    // private int age; // The private keyword ensures that the variable is only accessible within this class // only us this for within the class operation.
    public String name; // using public so that the inherited classes can see these variables.
    public int age;
    //USE PROTECT WHEN YOU NEED : Only things withing the same package or subclasses of this class can access this variable. Other packages wil not be able to access this

    //constructor
    public Dog(String name, int age) {
        this.name = name;
        this.age = age; // this. finds the private attribute of the class.
        Dog.count += 1; // keeping count of how many dogs r there... this is how static variables work. IMPORTANT  COUNT WILL CHANGE FOR ALL INSTANCES.
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

    public void display2() { // this will require a instance to function.
        System.out.print("DOg");
    }

    // static functions
    public static void display() { // doesn't need a instance to be called.
        System.out.print("DOg");
    }
}
