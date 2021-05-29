package Overloaded;

public class Main {
    public static void main(String[] args) {
        /**
         * overloaded constructors = multiple constructors within a class with the same name,
         *                           but have different parameters
         *                           name + parameters = signature.
         */
        Pizza pizza1 = new Pizza("thick crust","tomato","mozzarella","pepperoni");
        Pizza pizza2 = new Pizza("thick crust","tomato","mozzarella");
        Pizza pizza3 = new Pizza("thick crust","tomato");
        Pizza pizza4 = new Pizza("thick crust");
        Pizza pizza5 = new Pizza();
        /**
         * println
         */
        System.out.println("Here are the ingredients of your pizza: ");
        System.out.println(pizza4.bread);
        System.out.println(pizza3.sauce);
        System.out.println(pizza2.cheese);
        System.out.println(pizza1.topping);

    }
}
