class Map {

    String country;
    String state;
    String city;
    double scale;
    String type;

    public Map() {
        System.out.println("Map no-arg constructor");
    }

    public Map(String country, String state, String city, double scale, String type) {
        this.country = country;
        this.state = state;
        this.city = city;
        this.scale = scale;
        this.type = type;
    }
}