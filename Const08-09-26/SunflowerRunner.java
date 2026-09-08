class SunflowerRunner {
    public static void main(String[] args) {

        Sunflower sunflower1 = new Sunflower();
        Sunflower sunflower2 = new Sunflower("Yellow", 5.5, 50, "Summer", true);

        System.out.println(sunflower1.color);
        System.out.println(sunflower1.height);
        System.out.println(sunflower1.price);
        System.out.println(sunflower1.season);
        System.out.println(sunflower1.fresh);

        System.out.println(sunflower2.color);
        System.out.println(sunflower2.height);
        System.out.println(sunflower2.price);
        System.out.println(sunflower2.season);
        System.out.println(sunflower2.fresh);
    }
}
