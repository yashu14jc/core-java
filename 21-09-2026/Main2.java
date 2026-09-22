class Main2 {

    public static void main(String[] args) {

        ShoppingMall mall = new ShoppingMall();

        mall.name = "Mantri Mall";
        mall.ownerName = "Mantri Group";

        mall.theater = new Theater();
        mall.theater.movieName = "KGF";
        mall.theater.ticketPrice = 250;
        mall.theater.totalSeats = 300;

        mall.info();
    }
}