class PrawnRunner {
    public static void main(String[] args) {

        Prawn prawn1 = new Prawn();
        Prawn prawn2 = new Prawn("Tiger Prawn", 1.0, 800, "Large", true);

        System.out.println(prawn1.type);
        System.out.println(prawn1.weight);
        System.out.println(prawn1.price);
        System.out.println(prawn1.size);
        System.out.println(prawn1.fresh);

        System.out.println(prawn2.type);
        System.out.println(prawn2.weight);
        System.out.println(prawn2.price);
        System.out.println(prawn2.size);
        System.out.println(prawn2.fresh);
    }
}
