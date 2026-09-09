class RailwayTicket {

    String passengerName;
    String trainName;
    String source;
    String destination;
    int ticketNumber;

    public RailwayTicket() {
        System.out.println("RailwayTicket no-arg constructor");
    }

    public RailwayTicket(String passengerName, String trainName, String source,
                  String destination, int ticketNumber) {

        this.passengerName = passengerName;
        this.trainName = trainName;
        this.source = source;
        this.destination = destination;
        this.ticketNumber = ticketNumber;
    }
}