class EnvironmentRunner {
    public static void main(String[] args) {
        Environment environment1 = new Environment();
        Environment environment2 = new Environment("Forest", "Karnataka", 28.5, "Tropical", false);

        System.out.println(environment1.type);
        System.out.println(environment1.location);
        System.out.println(environment1.temperature);
        System.out.println(environment1.climate);
        System.out.println(environment1.polluted);

        System.out.println(environment2.type);
        System.out.println(environment2.location);
        System.out.println(environment2.temperature);
        System.out.println(environment2.climate);
        System.out.println(environment2.polluted);
    }
}
