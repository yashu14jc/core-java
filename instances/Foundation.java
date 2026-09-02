class Foundation {

    String brand = "Lakme";
    String shade = "Natural";
    int price = 500;
    double weight = 30.5;
    boolean available = true;

    String color;
    int quantity;
    double size;
    char grade;
    boolean waterproof;

    public static void main(String[] args) {

        Foundation foundation1 = new Foundation();
        Foundation foundation2 = new Foundation();

        System.out.println(foundation1.brand);
        System.out.println(foundation1.shade);
        System.out.println(foundation1.price);
        System.out.println(foundation1.weight);
        System.out.println(foundation1.available);
        System.out.println(foundation1.color);
        System.out.println(foundation1.quantity);
        System.out.println(foundation1.size);
        System.out.println(foundation1.grade);
        System.out.println(foundation1.waterproof);

        System.out.println("----------");

        System.out.println(foundation2.brand);
        System.out.println(foundation2.shade);
        System.out.println(foundation2.price);
        System.out.println(foundation2.weight);
        System.out.println(foundation2.available);
        System.out.println(foundation2.color);
        System.out.println(foundation2.quantity);
        System.out.println(foundation2.size);
        System.out.println(foundation2.grade);
        System.out.println(foundation2.waterproof);
    }
}