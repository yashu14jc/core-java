class Steel {

    String type = "Stainless Steel";
    String brand = "Tata";
    int price = 100;
    double weight = 50.5;
    boolean strong = true;

    String color;
    int quantity;
    double thickness;
    char grade;
    boolean rusted;

    public static void main(String[] args) {

        Steel steel1 = new Steel();
        Steel steel2 = new Steel();

        System.out.println(steel1.type);
        System.out.println(steel1.brand);
        System.out.println(steel1.price);
        System.out.println(steel1.weight);
        System.out.println(steel1.strong);
        System.out.println(steel1.color);
        System.out.println(steel1.quantity);
        System.out.println(steel1.thickness);
        System.out.println(steel1.grade);
        System.out.println(steel1.rusted);

        System.out.println("----------");

        System.out.println(steel2.type);
        System.out.println(steel2.brand);
        System.out.println(steel2.price);
        System.out.println(steel2.weight);
        System.out.println(steel2.strong);
        System.out.println(steel2.color);
        System.out.println(steel2.quantity);
        System.out.println(steel2.thickness);
        System.out.println(steel2.grade);
        System.out.println(steel2.rusted);
    }
}