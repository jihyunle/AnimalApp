/*Your Assignment:

What just happened? Comment your understanding of object-oriented programming from the four classes created above.
Where is the method executing encapsulation? Inheritance? Or polymorphism?

Encapsulation allows us to code with private fields and public methods so that the data within is safe from external corruption.
Method that executes this is the constructor method in each class.
Inheritance occurs when we extend the super class to the sub class, which inherits all the methods from its super class.
The method that executes this is "extends" keyword in the class declaration.
Polymorphism: Creating interchangeable objects you can select based on the need.
Not sure where this method is used in this example.

Create 2 more animal classes (i.e. Dog, Mouse, etc.) and extend the animal class to verify your understanding.

Created Dog and Otter classes.*/

public class AnimalApp {

    public static void main(String[] args) {

        Animal a = new Animal();
        print(a.eat());
        print(a.sleep());

        Cat c = new Cat();
        print(c.eat());
        print(c.sleep());
        print(c.purr());


        Bird b = new Bird();
        print(b.eat());
        print(b.sleep());
        print(b.fly());

        Dog d = new Dog();
        print(d.eat());
        print(d.sleep());
        print(d.bark());

        Otter o = new Otter();
        print(o.eat());
        print(o.sleep());
        print(o.build());

    }

    private static void print(String s) {
        System.out.println(s);
    }
}