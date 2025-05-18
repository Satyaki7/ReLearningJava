package FirstPackage;

public class Main {

    public static void main(String[] args) {
        // // Student joe = new Student("Joe"); // These are diff objects even if 
        // // Student bill = new Student("Bill");
        // // Student tim = new Student("Tim");

        // // System.out.println(joe.equals(tim)); // Here we are checking equality of objects.
        // // System.out.println(joe.compareTo(bill) > 0); // if greatre than 0 then joe is greater
        // // System.out.println(joe.compareTo(tim) < 0);
        // // System.out.print(tim); // output: FirstPackage.Student@7344699f ----> this is the memory location of the object
        // OuterClass out = new OuterClass();
        // // OuterClass.InnerClass in = out.new InnerClass();
        // // in.display();
        // out.inner();
        //USING INTERFACE
        // Car ford = new Car();
        // ford.speedUp(10);
        // ford.changeGear(2);
        // ford.display();
        // System.out.println(Vehicle.math(5));// just like the functions we use.
        //USING ENUMS
        Level lvl = Level.LOW;
        //Level[] arr = Level.values();
        // for (Level e : arr) {
        //     System.out.println(e);
        // }
        // if (lvl == Level.LOW) {
        //     System.out.println(lvl);
        // } else if (lvl == Level.MEDIUM) {
        //     System.out.println(lvl);
        // } else {
        //     System.out.println(lvl);
        // }
        System.out.println(lvl.getLvl());
        System.out.println(Level.valueOf("LOW"));
        lvl.setLvl(5);
        System.out.println(lvl.getLvl());

        //THE END
    }
}
