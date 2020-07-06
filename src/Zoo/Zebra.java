package Zoo;

public class Zebra extends  Animal {


    public Zebra(String name, int age) {
        super(name, age);
    }

    public Zebra() {
        super("wPaski",2);
    }

    public void eatGrass(){
        System.out.println("zebra eats grass");
    }

    @Override
    public void makeSound() {
        System.out.println("zebra make sound");
    }
}
