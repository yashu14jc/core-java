class RabbitRunner {
    public static void main(String[] args) {

        Rabbit rabbit1 = new Rabbit();
        Rabbit rabbit2 = new Rabbit("Bunny", "White", 2.5, 2, true);

        System.out.println(rabbit1.name);
        System.out.println(rabbit1.color);
        System.out.println(rabbit1.weight);
        System.out.println(rabbit1.age);
        System.out.println(rabbit1.domestic);

        System.out.println(rabbit2.name);
        System.out.println(rabbit2.color);
        System.out.println(rabbit2.weight);
        System.out.println(rabbit2.age);
        System.out.println(rabbit2.domestic);
    }
}
