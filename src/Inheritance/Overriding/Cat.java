package Inheritance.Overriding;

public class Cat extends Animal {

    // Method Hiding
    public static void testClassMethod() {
        System.out.println("The static method in Cat");
    }
    // Method Overriding
    public void testInstanceMethod() {
        System.out.println("The instance method in Cat");
    }

    public static void main(String[] args) {
        Cat myCat = new Cat();
        Animal myAnimal = myCat;
        Animal.testClassMethod();
        myAnimal.testInstanceMethod();
    }
}
