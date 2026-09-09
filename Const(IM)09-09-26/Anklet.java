class Anklet {

    String material;
    String color;
    double weight;
    int price;

    public Anklet(String material, String color, double weight, int price) {
        this.material = material;
        this.color = color;
        this.weight = weight;
        this.price = price;
    }

    void AnkletInfo() {
        System.out.println(material);
        System.out.println(color);
        System.out.println(weight);
        System.out.println(price);
    }
}