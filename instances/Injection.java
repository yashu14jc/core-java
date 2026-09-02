class Injection {

    String name = "Insulin";
    String type = "Injection";
    int price = 100;
    double volume = 5.0;
    boolean available = true;

    String brand;
    int quantity;
    double weight;
    char grade;
    boolean expired;

    public static void main(String[] args) {

        Injection injection1 = new Injection();
        Injection injection2 = new Injection();

        System.out.println(injection1.name);
        System.out.println(injection1.type);
        System.out.println(injection1.price);
        System.out.println(injection1.volume);
        System.out.println(injection1.available);
        System.out.println(injection1.brand);
        System.out.println(injection1.quantity);
        System.out.println(injection1.weight);
        System.out.println(injection1.grade);
        System.out.println(injection1.expired);

        System.out.println("----------");

        System.out.println(injection2.name);
        System.out.println(injection2.type);
        System.out.println(injection2);
        System.out.println(injection2.volume);
        System.out.println(injection2.available);
        System.out.println(injection2);
        System.out.println(injection2);
        System.out.println(injection2.weight);
        System.out.println(injection2.grade);
        System.out.println(injection2.expired);
    }
}