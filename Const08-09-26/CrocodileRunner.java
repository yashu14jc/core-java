class CrocodileRunner {
    public static void main(String[] args) {

        Crocodile crocodile1 = new Crocodile();
        Crocodile crocodile2 = new Crocodile("Nile Crocodile", 4.5, 300, "River", true);

        System.out.println(crocodile1.name);
        System.out.println(crocodile1.length);
        System.out.println(crocodile1.weight);
        System.out.println(crocodile1.habitat);
        System.out.println(crocodile1.dangerous);

        System.out.println(crocodile2.name);
        System.out.println(crocodile2.length);
        System.out.println(crocodile2.weight);
        System.out.println(crocodile2.habitat);
        System.out.println(crocodile2.dangerous);
    }
}
