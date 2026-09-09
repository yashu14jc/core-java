class Adopter {

    String name;
    String address;
    int age;
    String phone;
    String email;

    public Adopter() {
        System.out.println("Adopter no-arg constructor");
    }

    public Adopter(String name, String address, int age, String phone, String email) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.phone = phone;
        this.email = email;
    }
}