class StadiumRunner {
    public static void main(String[] args) {
        Stadium stadium1 = new Stadium();
        Stadium stadium2 = new Stadium("Chinnaswamy", "Bangalore", 40000, "Cricket", false);

        System.out.println(stadium1.name);
        System.out.println(stadium1.location);
        System.out.println(stadium1.capacity);
        System.out.println(stadium1.sport);
        System.out.println(stadium1.indoor);

        System.out.println(stadium2.name);
        System.out.println(stadium2.location);
        System.out.println(stadium2.capacity);
        System.out.println(stadium2.sport);
        System.out.println(stadium2.indoor);
    }
}
