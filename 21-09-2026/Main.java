class Main {

    public static void main(String[] args) {

        Seat seat = new Seat();

        seat.number = 2;
        seat.booked = true;

        seat.passenger = new Passenger();
        seat.passenger.name = "Yasvanth";

        seat.info();
    }
}