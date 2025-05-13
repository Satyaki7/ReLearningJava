package FirstPackage;

public class OOPS {

    // //without return // not using PascalCasing in this cause I want to use print like py
    // public static void print(String a, int x) {
    //     for (int i = 0; i < x; i++) {
    //         System.out.println(a);
    //     }
    // }
    // //with return type int
    // public static int Length(String a) {
    //     return (a.length());
    // }
    //main function
    public static void main(String[] args) {
        /*
        In Java, an object is an instance of a class. It is a real-world entity that has state (attributes/fields) and behavior (methods). Objects are created using the new keyword and are used to access the members (fields and methods) of a class.
         */
        // print("Hello", 5);
        // print(Integer.toString(Length("Hello World")), 1);

        // Dog hello = new Dog("Hello", 4);
        // hello.speak();
        // System.out.println(hello.getAge());
        // hello.setAge(5);
        // System.out.print(hello.getAge());
        // //
        // //hello.add2();
        // /* WILL GIVE A ERROR 
        //     FirstPackage\OOPS.java:29: error: add2() has private access in Dog
        //      hello.add2();
        //      ^
        //     1 error
        //  */
        // -------- INHERITANCE ---------------
        Cat hello1 = new Cat("Billu", 18, 100);
        hello1.speak();
        Cat hello2 = new Cat("Bill", 26);
        Cat hello3 = new Cat("Billum");
        hello2.speak();
        hello3.speak();

    }
}
