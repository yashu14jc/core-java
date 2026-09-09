class Zip {

    String color;
    int length;
    String type;
    int price;

    public Zip(String color, int length, String type, int price) {
        this.color = color;
        this.length = length;
        this.type = type;
        this.price = price;
    }

    void ZipInfo() {
        System.out.println(color);
        System.out.println(length);
        System.out.println(type);
        System.out.println(price);
    }
}