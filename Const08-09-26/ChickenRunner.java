class ChickenRunner {
    public static void main(String[] args) {

        Chicken chicken1 = new Chicken();
        Chicken chicken2 = new Chicken("Broiler", 2.5, 300, "White", true);

        System.out.println(chicken1.type);
        System.out.println(chicken1.weight);
        System.out.println(chicken1.price);
        System.out.println(chicken1.color);
        System.out.println(chicken1.fresh);

        System.out.println(chicken2.type);
        System.out.println(chicken2.weight);
        System.out.println(chicken2.price);
        System.out.println(chicken2.color);
        System.out.println(chicken2.fresh);
    }
}
