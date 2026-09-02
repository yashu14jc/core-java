class Engine {

    String brand = "Honda";
    String type = "Petrol";
    int price = 75000;
    double capacity = 1.5;
    boolean working = true;

    String model;
    int cylinders;
    double mileage;
    char grade;
    boolean damaged;

    public static void main(String[] args) {

        Engine engine1 = new Engine();
        Engine engine2 = new Engine();

        System.out.println(engine1.brand);
        System.out.println(engine1.type);
        System.out.println(engine1.price);
        System.out.println(engine1.capacity);
        System.out.println(engine1.working);
        System.out.println(engine1.model);
        System.out.println(engine1.cylinders);
        System.out.println(engine1.mileage);
        System.out.println(engine1.grade);
        System.out.println(engine1.damaged);

        System.out.println("----------");

        System.out.println(engine2.brand);
        System.out.println(engine2.type);
        System.out.println(engine2.price);
        System.out.println(engine2.capacity);
        System.out.println(engine2.working);
        System.out.println(engine2.model);
        System.out.println(engine2.cylinders);
        System.out.println(engine2.mileage);
        System.out.println(engine2.grade);
        System.out.println(engine2.damaged);
    }
}