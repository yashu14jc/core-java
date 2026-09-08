class FishRunner {
    public static void main(String[] args) {

        Fish fish1 = new Fish();
        Fish fish2 = new Fish("Rohu", 2.0, 400, "Freshwater", true);

        System.out.println(fish1.name);
        System.out.println(fish1.weight);
        System.out.println(fish1.price);
        System.out.println(fish1.waterType);
        System.out.println(fish1.fresh);

        System.out.println(fish2.name);
        System.out.println(fish2.weight);
        System.out.println(fish2.price);
        System.out.println(fish2.waterType);
        System.out.println(fish2.fresh);
    }
}
