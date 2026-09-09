class SwimmingPool {

    String name;
    String location;
    int length;
    int depth;

    public SwimmingPool(String name, String location, int length, int depth) {
        this.name = name;
        this.location = location;
        this.length = length;
        this.depth = depth;
    }

    void SwimmingPoolInfo() {
        System.out.println(name);
        System.out.println(location);
        System.out.println(length);
        System.out.println(depth);
    }
}