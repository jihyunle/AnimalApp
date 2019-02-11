public class Dog extends Animal {

    public Dog(){
        System.out.println("A dog is born...");
    }

    @Override
    public String eat(){
        return "A dog eats...";
    }

    public String sleep(){
        return "A dog sleeps...";
    }

    public String bark(){
        return  "Ruf! Ruf!";
    }

}
