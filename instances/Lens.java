class Lens {

    String brand = "Canon";
    String type = "Camera";
    int price = 25000;
    double weight = 0.5;
    boolean available = true;

    String color;
    int size;
    double zoom;
    char grade;
    boolean damaged;

    public static void main(String[] args) {

        Lens lens1 = new Lens();
        Lens lens2 = new Lens();

        System.out.println(lens1.brand);
        System.out.println(lens1.type);
        System.out.println(lens1.price);
        System.out.println(lens1.weight);
        System.out.println(lens1.available);
        System.out.println(lens1.color);
        System.out.println(lens1.size);
        System.out.println(lens1.zoom);
        System.out.println(lens1.grade);
        System.out.println(lens1.damaged);

        System.out.println("----------");

        System.out.println(lens2.brand);
        System.out.println(lens2.type);
        System.out.println(lens2.price);
        System.out.println(lens2.weight);
        System.out.println(lens2.available);
        System.out.println(lens2.color);
        System.out.println(lens2.size);
        System.out.println(lens2.zoom);
        System.out.println(lens2.grade);
        System.out.println(lens2.damaged);
    }
}