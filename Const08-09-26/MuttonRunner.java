class MuttonRunner {
    public static void main(String[] args) {

        Mutton mutton1 = new Mutton();
        Mutton mutton2 = new Mutton("Goat", 3.0, 900, "Premium", true);

        System.out.println(mutton1.type);
        System.out.println(mutton1.weight);
        System.out.println(mutton1.price);
        System.out.println(mutton1.quality);
        System.out.println(mutton1.fresh);

        System.out.println(mutton2.type);
        System.out.println(mutton2.weight);
        System.out.println(mutton2.price);
        System.out.println(mutton2.quality);
        System.out.println(mutton2.fresh);
    }
}
