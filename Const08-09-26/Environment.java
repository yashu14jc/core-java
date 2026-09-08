class Environment {
    String type;
    String location;
    double temperature;
    String climate;
    boolean polluted;

    Environment() {
    }

    Environment(String type, String location, double temperature, String climate, boolean polluted) {
        this.type = type;
        this.location = location;
        this.temperature = temperature;
        this.climate = climate;
        this.polluted = polluted;
    }
}
