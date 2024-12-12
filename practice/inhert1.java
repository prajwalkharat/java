class Animal {
    // Properties of Animal
    String name;
    int age;

    // Constructor
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display information about the animal
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Method to make a sound (can be overridden)
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animal {
    // Additional property for Dog
    String breed;

    // Constructor
    Dog(String name, int age, String breed) {
        super(name, age); // Call the constructor of the superclass (Animal)
        this.breed = breed;
    }

    // Method to display information about the dog
    @Override
    void displayInfo() {
        super.displayInfo(); // Call the superclass method
        System.out.println("Breed: " + breed);
    }

    // Overridden method to make a sound
    @Override
    void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

class TestInheritance {
    public static void main(String[] args) {
        // Create an instance of Dog
        Dog myDog = new Dog("Buddy", 3, "Golden Retriever");

        // Display information about the dog
        myDog.displayInfo();

        // Make the dog make a sound
        myDog.makeSound();
    }
}

