class Shipment {

    String trackingNumber;
    String product;
    String source;
    String destination;
    double weight;

    public Shipment() {
        System.out.println("Shipment no-arg constructor");
    }

    public Shipment(String trackingNumber, String product, String source,
             String destination, double weight) {

        this.trackingNumber = trackingNumber;
        this.product = product;
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }
}