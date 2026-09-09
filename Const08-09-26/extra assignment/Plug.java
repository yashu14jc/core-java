class Plug {

    String brand;
    String color;
    int pins;
    int voltage;
    int price;

    public Plug() {
        System.out.println("Plug no-arg constructor");
    }

    public Plug(String brand, String color, int pins, int voltage, int price) {
        this.brand = brand;
        this.color = color;
        this.pins = pins;
        this.voltage = voltage;
        this.price = price;
    }
}