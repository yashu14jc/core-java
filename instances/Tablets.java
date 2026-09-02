class Tablets {

    String name = "Paracetamol";
    String type = "Tablet";
    int price = 50;
    double weight = 0.5;
    boolean available = true;

    String brand;
    int quantity;
    double strength;
    char grade;
    boolean expired;

    public static void main(String[] values) {

        Tablets table1 = new Tablets();
        Tablets table2 = new Tablets();

        System.out.println(table1.name);
        System.out.println(table1.type);
        System.out.println(table1.price);
        System.out.println(table1.weight);
        System.out.println(table1.available);
        System.out.println(table1.brand);
        System.out.println(table1.quantity);
        System.out.println(table1.strength);
        System.out.println(table1.grade);
        System.out.println(table1.expired);

        System.out.println("----------");

        System.out.println(table2.name);
        System.out.println(table2.type);
        System.out.println(table2.price);
        System.out.println(table2.weight);
        System.out.println(table2.available);
        System.out.println(table2.brand);
        System.out.println(table2.quantity);
        System.out.println(table2.strength);
        System.out.println(table2.grade);
        System.out.println(table2.expired);
    }
}