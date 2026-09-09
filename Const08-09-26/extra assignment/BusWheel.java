class BusWheel {

    String brand;
    int size;
    String type;
    double weight;
    int price;

    public BusWheel() {
        System.out.println("BusWheel no-arg constructor");
    }

    public BusWheel(String brand, int size, String type, double weight, int price) {
        this.brand = brand;
        this.size = size;
        this.type = type;
        this.weight = weight;
        this.price = price;
    }
}