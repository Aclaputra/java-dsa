package OOP;

public class Main {
    public static void main(String[] args) {
        /**
         * object = an instance of a class that may contain attributes and methods
         * example : (phone, desk, computer, coffee cup)
         */
//        Car myCar1 = new Car();
//        Car myCar2 = new Car();
//
//        System.out.println(myCar1.make);
//        System.out.println(myCar1.model);
//        myCar.drive();
//        myCar.brake();

        Human human1 = new Human("Acla",20,60);
        Human human2 = new Human("Morty",16,50);

        human2.eat();
        human1.drink();

    }
}
