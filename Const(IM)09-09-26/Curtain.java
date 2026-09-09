class Curtain {

    String color;
    String material;
    int length;
    int price;

    public Curtain(String color, String material, int length, int price) {
        this.color = color;
        this.material = material;
        this.length = length;
        this.price = price;
    }

    void CurtainInfo() {
        System.out.println(color);
        System.out.println(material);
        System.out.println(length);
        System.out.println(price);
    }
}