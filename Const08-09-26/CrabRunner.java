class CrabRunner {
    public static void main(String[] args) {

        Crab crab1 = new Crab();
        Crab crab2 = new Crab("Sea Crab", 1.5, 600, "Brown", true);

        System.out.println(crab1.type);
        System.out.println(crab1.weight);
        System.out.println(crab1.price);
        System.out.println(crab1.color);
        System.out.println(crab1.fresh);

        System.out.println(crab2.type);
        System.out.println(crab2.weight);
        System.out.println(crab2.price);
        System.out.println(crab2.color);
        System.out.println(crab2.fresh);
    }
}
