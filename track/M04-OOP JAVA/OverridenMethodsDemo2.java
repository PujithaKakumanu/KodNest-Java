
class Animal {

    void walk() {
        System.out.println("Animal is walking");
    }

    void eat() {
        System.out.println("Animal is eating");
    }
}

class Monkey extends Animal {

    @Override
    void walk() {
        System.out.println("Monkey is walking on the trees");
    }

    @Override
    void eat() {
        System.out.println("Monkey Steals Banana and eats");
    }

    void jump() {
        System.out.println("Monkey is jumping");
    }

}

class Cat extends Animal {

    @Override
    void walk() {
        System.out.println("Cat is walking");
    }

    void meow() {
        System.out.println("Cat is meowing");
    }
}

public class OverridenMethodsDemo2 {

    public static void main(String[] args) {
        Animal a = new Animal();
        a.walk();
        Monkey m = new Monkey();
        m.walk();
        m.eat();
        m.jump();
        Cat c = new Cat();
        c.walk();
        c.eat();
        c.meow();
    }

}

