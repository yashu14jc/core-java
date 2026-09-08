class Panner {
    String type;
    double weight;
    double price;
    String brand;
    boolean fresh;

    Panner() {
    }

    Panner(String type, double weight, double price, String brand, boolean fresh) {
        this.type = type;
        this.weight = weight;
        this.price = price;
        this.brand = brand;
        this.fresh = fresh;
    }
}
