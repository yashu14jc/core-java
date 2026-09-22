class Seat {

    int number;
    boolean booked;
    Passenger passenger;

    void info() {
        System.out.println("Seat Number: " + number);
        System.out.println("Booked: " + booked);
        passenger.info();
    }
}