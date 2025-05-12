package FirstPackage;

public class OOPS {

    //without return // not using PascalCasing in this cause I want to use print like py
    public static void print(String a, int x) {
        for (int i = 0; i < x; i++) {
            System.out.println(a);
        }
    }

    //with return type int
    public static int Length(String a) {
        return (a.length());
    }

    //main function
    public static void main(String[] args) {
        /*
        In Java, an object is an instance of a class. It is a real-world entity that has state (attributes/fields) and behavior (methods). Objects are created using the new keyword and are used to access the members (fields and methods) of a class.
         */
        print("Hello", 5);
        print(Integer.toString(Length("Hello World")), 1);
    }
}
