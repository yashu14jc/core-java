class Studio {
    String name;
    String location;
    int rooms;
    String type;
    boolean available;

    Studio() {
    }

    Studio(String name, String location, int rooms, String type, boolean available) {
        this.name = name;
        this.location = location;
        this.rooms = rooms;
        this.type = type;
        this.available = available;
    }
}
