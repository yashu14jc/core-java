class OctopusRunner {
    public static void main(String[] args) {

        Octopus octopus1 = new Octopus();
        Octopus octopus2 = new Octopus("Sea Octopus", 2.0, 1000, "Grey", true);

        System.out.println(octopus1.type);
        System.out.println(octopus1.weight);
        System.out.println(octopus1.price);
        System.out.println(octopus1.color);
        System.out.println(octopus1.fresh);

        System.out.println(octopus2.type);
        System.out.println(octopus2.weight);
        System.out.println(octopus2.price);
        System.out.println(octopus2.color);
        System.out.println(octopus2.fresh);
    }
}
