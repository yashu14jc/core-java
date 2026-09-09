class Nest {

    String type;
    String location;
    int eggs;
    String bird;

    public Nest(String type, String location, int eggs, String bird) {
        this.type = type;
        this.location = location;
        this.eggs = eggs;
        this.bird = bird;
    }

    void NestInfo() {
        System.out.println(type);
        System.out.println(location);
        System.out.println(eggs);
        System.out.println(bird);
    }
}