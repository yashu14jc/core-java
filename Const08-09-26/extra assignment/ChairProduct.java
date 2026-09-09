class ChairProduct {

    String brand;
    String color;
    String material;
    int height;
    int price;

    public ChairProduct() {
        System.out.println("Chair no-arg constructor");
    }

    public ChairProduct(String brand, String color, String material, int height, int price) {
        this.brand = brand;
        this.color = color;
        this.material = material;
        this.height = height;
        this.price = price;
    }
}