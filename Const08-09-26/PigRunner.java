class PigRunner {
    public static void main(String[] args) {

        Pig pig1 = new Pig();
        Pig pig2 = new Pig("Pinky", "Pink", 80, 3, true);

        System.out.println(pig1.name);
        System.out.println(pig1.color);
        System.out.println(pig1.weight);
        System.out.println(pig1.age);
        System.out.println(pig1.domestic);

        System.out.println(pig2.name);
        System.out.println(pig2.color);
        System.out.println(pig2.weight);
        System.out.println(pig2.age);
        System.out.println(pig2.domestic);
    }
}
