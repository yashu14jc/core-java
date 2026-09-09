class Flight {

    String flightNumber;
    String source;
    String destination;
    int passengers;
    double ticketPrice;

    public Flight() {
        System.out.println("Flight no-arg constructor");
    }

    public Flight(String flightNumber, String source, String destination,
           int passengers, double ticketPrice) {

        this.flightNumber = flightNumber;
        this.source = source;
        this.destination = destination;
        this.passengers = passengers;
        this.ticketPrice = ticketPrice;
    }
}