package FirstPackage;
// THIS IS AN EXAMPLE OF INHERITANCE
// BASICALLY YOU DON'T WANT TO GO AROUND COPYING CLASSES TO MAKE NEW FILES WHEN THERE IS 1000 LINE OF CODE IN A PERTICULAR CLASS
//here the Dog class is the super class and all the functions of the dog class are getting copied here.
// cat is the sub class

public class Cat extends Dog {

    // same type of constructor as that of the dog class we can add more if we want
    private int food;

    public Cat(String name, int age, int food) {
        super(name, age); // explicitely calling the super class constructor through this statement
        this.food = food;
    }

    // this is a second constructor. This will be used in case a different set of arguments are passed into this class while calling.
    //THERE CAN BE MULTIPLE CONSTRUCTORS AND THE ONE MATCHING THE ARGUMENTS PASSED WILL BE EXECUTED
    public Cat(String name, int age) {
        super(name, age);
        this.food = 50; // setting up a default value for food.
    }

    public Cat(String name) {
        super(name, 1); // ASSUMING THAT THEY ONLY PROVIDE THE NAME AND NOT THE AGE.
        this.food = 50;
    }

    //Overriding the previous speak method 
    public void speak() {
        System.out.println("Meow this is " + this.name + " I am " + this.age + " years old and eat" + this.food + " grams of food");
    }

    // adding more methods [this is optional]
    // this function will not be visible to the dog class as this is a child/sub class of the dog class and dog class is the parent or super class of this class
    public void eat(int x) {
        this.food -= x;
    }
}
