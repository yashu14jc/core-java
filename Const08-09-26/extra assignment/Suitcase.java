class Suitcase {

    String brand;
    String color;
    int size;
    double weight;
    int price;

    public Suitcase() {
        System.out.println("Suitcase no-arg constructor");
    }

    public Suitcase(String brand, String color, int size, double weight, int price) {
        this.brand = brand;
        this.color = color;
        this.size = size;
        this.weight = weight;
        this.price = price;
    }
}