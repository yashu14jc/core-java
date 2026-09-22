class ShoppingMall {

    String name;
    String ownerName;
    Theater theater;

    void info() {
        System.out.println("Mall Name: " + name);
        System.out.println("Owner Name: " + ownerName);
        theater.info();
    }
}