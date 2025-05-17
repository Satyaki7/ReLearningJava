package FirstPackage;

public class OuterClass {

    // public class InnerClass { //Only accessible within the Outer class

    //     public void display() {
    //         System.out.print("This is an inner class");
    //     }
    // }

    public void inner() {
        class InnerClass{
            public void display(){
                System.out.println("Inner Class");
            }
        }
        InnerClass in = new InnerClass();
        in.display();
    }
}
