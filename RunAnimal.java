import java.util.Scanner;
public class RunAnimal {
    public static void main(String[] args) {

        System.out.print("Enter animal (B for Bird, C for Cat, D for Dog): ");
        Scanner sc = new Scanner(System.in);
        String choice = sc.next().toUpperCase().substring(0,1);
        Animal animal = null;
        switch (choice) {
            case "B":
                animal = new Bird();
                break;
            case "C":
                animal = new Cat();
                break;
            case "D":
                animal = new Dog();
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        animal.eat();
        animal.sleep();
        animal.makeSound();
    }
}

abstract class Animal {

    abstract void eat();
    abstract void sleep();
    abstract void makeSound();
}

class Bird extends Animal {

    void eat() {
        System.out.println("Bird loves eat worms.");
    }

    void sleep() {
        System.out.println("Bird sleep 10-12 hours");
    }

    void makeSound() {
        System.out.println("Tweet Tweet ");
    }
}

class Cat extends Animal {

    void eat() {
        System.out.println("Cat loves tuna fish.");
    }

    void sleep() {
        System.out.println("Cat sleep 12 - 16 hours.");
    }

    void makeSound() {
        System.out.println("Meow Meow ");
    }
}

class Dog extends Animal {

    void eat() {
        System.out.println("Dog loves meat");
    }

    void sleep() {
        System.out.println("Dog sleep 12-14 hours");
    }

    void makeSound() {
        System.out.println("Aww! Aww!");
    }
}
