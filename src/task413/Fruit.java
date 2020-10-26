package task413;

public class Fruit {
    public void printClass() {
        System.out.println("I am super class Fruit");
    }
}

class Apple extends Fruit {
    @Override
    public void printClass() {
        System.out.println("I am sub class Apple");
    }
}

class Banana extends Fruit {
    @Override
    public void printClass() {
        System.out.println("I am sub class Banana");
    }
}
