class AccessoriesRunner {
    public static void main(String[] args) {
        Accessories accessories1 = new Accessories();
        Accessories accessories2 = new Accessories("Watch", "Titan", 2500, "Steel", true);

        System.out.println(accessories1.name);
        System.out.println(accessories1.brand);
        System.out.println(accessories1.price);
        System.out.println(accessories1.material);
        System.out.println(accessories1.available);

        System.out.println(accessories2.name);
        System.out.println(accessories2.brand);
        System.out.println(accessories2.price);
        System.out.println(accessories2.material);
        System.out.println(accessories2.available);
    }
}
