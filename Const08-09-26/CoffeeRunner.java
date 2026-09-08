class CoffeeRunner {
    public static void main(String[] args) {
        Coffee coffee1 = new Coffee();
        Coffee coffee2 = new Coffee("Filter Coffee", "South Indian", 40, "Medium", true);

        System.out.println(coffee1.name);
        System.out.println(coffee1.type);
        System.out.println(coffee1.price);
        System.out.println(coffee1.size);
        System.out.println(coffee1.hot);

        System.out.println(coffee2.name);
        System.out.println(coffee2.type);
        System.out.println(coffee2.price);
        System.out.println(coffee2.size);
        System.out.println(coffee2.hot);
    }
}
