class Temple {

    String name;
    String location;
    God god;

    void info() {
        System.out.println("Temple Name: " + name);
        System.out.println("Location: " + location);
        god.info();
    }
}