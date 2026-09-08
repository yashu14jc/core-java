class Prawn {
    String type;
    double weight;
    double price;
    String size;
    boolean fresh;

    Prawn() {
    }

    Prawn(String type, double weight, double price, String size, boolean fresh) {
        this.type = type;
        this.weight = weight;
        this.price = price;
        this.size = size;
        this.fresh = fresh;
    }
}
