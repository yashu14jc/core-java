class WeldingMachine {

    String brand;
    int power;
    String type;
    int price;

    public WeldingMachine(String brand, int power, String type, int price) {
        this.brand = brand;
        this.power = power;
        this.type = type;
        this.price = price;
    }

    void WeldingMachineInfo() {
        System.out.println(brand);
        System.out.println(power);
        System.out.println(type);
        System.out.println(price);
    }
}