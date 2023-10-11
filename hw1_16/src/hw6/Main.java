package hw6;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Cat");
        Dog dog = new Dog("Dog");

        cat.run(100);
        cat.swim(7);

        dog.run(300);
        dog.swim(8);

        System.out.println("Number of Animals is " + Animals.getAnimalNumber());
        System.out.println("Number of Dogs is " + Dog.getDogNumber());
        System.out.println("Number of Cats is " + Cat.getCatNumber());

        System.out.println("Cat's name is " + cat.getName());
        System.out.println("Cat's name is " + dog.getName());
    }
}
