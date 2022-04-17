public class Driver {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        Bird b = new Bird();
        Dog e = new Dog();

        Animal[] pets = {d, c, b, e};

        for (int i=0; i<pets.length; i++)
            pets[i].speak();

            eat(b);
            eat(c);
    }
    public static void eat(Animal x) {
        System.out.println("The animal ate and said ");
        x.speak();
    }
}
