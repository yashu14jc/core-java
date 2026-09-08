class EggRunner {
    public static void main(String[] args) {

        Egg egg1 = new Egg();
        Egg egg2 = new Egg("Chicken Egg", "White", 7, 12, true);

        System.out.println(egg1.type);
        System.out.println(egg1.color);
        System.out.println(egg1.price);
        System.out.println(egg1.quantity);
        System.out.println(egg1.fresh);

        System.out.println(egg2.type);
        System.out.println(egg2.color);
        System.out.println(egg2.price);
        System.out.println(egg2.quantity);
        System.out.println(egg2.fresh);
    }
}
