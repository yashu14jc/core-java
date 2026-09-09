class Factory {

    String name;
    String location;
    int workers;
    String product;

    public Factory(String name, String location, int workers, String product) {
        this.name = name;
        this.location = location;
        this.workers = workers;
        this.product = product;
    }

    void FactoryInfo() {
        System.out.println(name);
        System.out.println(location);
        System.out.println(workers);
        System.out.println(product);
    }
}