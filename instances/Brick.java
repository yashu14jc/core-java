class Brick {

    String material = "Clay";
    String type = "Red Brick";
    int price = 20;
    double weight = 3.5;
    boolean strong = true;

    String color;
    int size;
    double length;
    char grade;
    boolean damaged;

    public static void main(String[] args) {

        Brick brick1 = new Brick();
        Brick brick2 = new Brick();

        System.out.println(brick1.material);
        System.out.println(brick1.type);
        System.out.println(brick1.price);
        System.out.println(brick1.weight);
        System.out.println(brick1.strong);
        System.out.println(brick1.color);
        System.out.println(brick1.size);
        System.out.println(brick1.length);
        System.out.println(brick1.grade);
        System.out.println(brick1.damaged);

        System.out.println("----------");

        System.out.println(brick2.material);
        System.out.println(brick2.type);
        System.out.println(brick2.price);
        System.out.println(brick2.weight);
        System.out.println(brick2.strong);
        System.out.println(brick2.color);
        System.out.println(brick2.size);
        System.out.println(brick2.length);
        System.out.println(brick2.grade);
        System.out.println(brick2.damaged);
    }
}