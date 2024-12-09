package lesson6.QLDV;

public class Monkey extends Animal{

    public Monkey(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound(){
        System.out.println("Monkey is chattering");
    }
    @Override
    public void action(){
        System.out.println("The monkey is climbing tree");
    }

}
