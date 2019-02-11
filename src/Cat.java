/*
 * All Cats are Animals but all Animals are not Cats
 */
public class Cat extends Animal {

    public Cat() {
        super();    // It's a way of referring to the parent
        System.out.println("Now I am a Cat!");
    }

    @Override
    public String sleep() {
        return "A cat sleeps...";
    }

    @Override
    public String eat() {
        return "A cat eats...";
    }

    public String purr() {
        return "purrr...";
    }

}