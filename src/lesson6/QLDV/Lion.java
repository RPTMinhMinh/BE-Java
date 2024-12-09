package lesson6.QLDV;

public class Lion extends Animal{

    public Lion(String name, int age) {
        super(name,age);
    }

    public void roar(){
        System.out.println("lion is roaring");
    }

    @Override
    public void makeSound() {
        System.out.println("Lion is roaring.");
    }
    @Override
    public void action(){
        System.out.println("The lion is hunting");
    }
}
