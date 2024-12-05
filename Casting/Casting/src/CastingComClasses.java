class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Woof");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Meow");
    }
}

public class CastingComClasses {
    public static void main(String[] args) {
        Animal myAnimal = new Dog();
        makeSound(myAnimal);

        myAnimal = new Cat();
        makeSound(myAnimal);
    }

    static void makeSound(Animal animal) {
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.sound();
        } else if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.sound();
        } else {
            animal.sound();
        }
    }
}