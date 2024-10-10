public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Rex", "czarny");
        System.out.println(dog1.makeSound());

        Cat cat1 = new Cat("kot", "bialy");
        System.out.println(cat1.makeSound());
        
        E e = new E();
        e.present("To jest test");
    }
}