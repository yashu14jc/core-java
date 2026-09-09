class Runner1 {

    public static void main(String[] args) {

        
        Suitcase suitcase1 = new Suitcase();
        Suitcase suitcase2 = new Suitcase("VIP", "Black", 25, 4.5, 3000);

        System.out.println("\nSUITCASE");
        System.out.println(suitcase1.brand);
        System.out.println(suitcase1.color);
        System.out.println(suitcase1.size);
        System.out.println(suitcase1.weight);
        System.out.println(suitcase1.price);

        System.out.println(suitcase2.brand);
        System.out.println(suitcase2.color);
        System.out.println(suitcase2.size);
        System.out.println(suitcase2.weight);
        System.out.println(suitcase2.price);


        
        Adopter adopter1 = new Adopter();
        Adopter adopter2 = new Adopter("Rahul", "Bangalore", 25, "9876543210", "rahul@gmail.com");

        System.out.println("\nADOPTER");
        System.out.println(adopter1.name);
        System.out.println(adopter1.address);
        System.out.println(adopter1.age);
        System.out.println(adopter1.phone);
        System.out.println(adopter1.email);

        System.out.println(adopter2.name);
        System.out.println(adopter2.address);
        System.out.println(adopter2.age);
        System.out.println(adopter2.phone);
        System.out.println(adopter2.email);


        
        BusWheel busWheel1 = new BusWheel();
        BusWheel busWheel2 = new BusWheel("MRF", 22, "Tubeless", 50.5, 15000);

        System.out.println("\nBUS WHEEL");
        System.out.println(busWheel1.brand);
        System.out.println(busWheel1.size);
        System.out.println(busWheel1.type);
        System.out.println(busWheel1.weight);
        System.out.println(busWheel1.price);

        System.out.println(busWheel2.brand);
        System.out.println(busWheel2.size);
        System.out.println(busWheel2.type);
        System.out.println(busWheel2.weight);
        System.out.println(busWheel2.price);


        
        Plug plug1 = new Plug();
        Plug plug2 = new Plug("Anchor", "White", 3, 240, 150);

        System.out.println("\nPLUG");
        System.out.println(plug1.brand);
        System.out.println(plug1.color);
        System.out.println(plug1.pins);
        System.out.println(plug1.voltage);
        System.out.println(plug1.price);

        System.out.println(plug2.brand);
        System.out.println(plug2.color);
        System.out.println(plug2.pins);
        System.out.println(plug2.voltage);
        System.out.println(plug2.price);


        Flight flight1 = new Flight();
        Flight flight2 = new Flight("AI101", "Bangalore", "Delhi", 180, 6500);

        System.out.println("\nFLIGHT");
        System.out.println(flight1.flightNumber);
        System.out.println(flight1.source);
        System.out.println(flight1.destination);
        System.out.println(flight1.passengers);
        System.out.println(flight1.ticketPrice);

        System.out.println(flight2.flightNumber);
        System.out.println(flight2.source);
        System.out.println(flight2.destination);
        System.out.println(flight2.passengers);
        System.out.println(flight2.ticketPrice);


        
        Shipment shipment1 = new Shipment();
        Shipment shipment2 = new Shipment("TR12345", "Laptop", "Bangalore", "Mumbai", 3.5);

        System.out.println("\nSHIPMENT");
        System.out.println(shipment1.trackingNumber);
        System.out.println(shipment1.product);
        System.out.println(shipment1.source);
        System.out.println(shipment1.destination);
        System.out.println(shipment1.weight);

        System.out.println(shipment2.trackingNumber);
        System.out.println(shipment2.product);
        System.out.println(shipment2.source);
        System.out.println(shipment2.destination);
        System.out.println(shipment2.weight);


        
        RailwayTicket railwayTicket1 = new RailwayTicket();
        RailwayTicket railwayTicket2 = new RailwayTicket(
                "Kiran",
                "Karnataka Express",
                "Bangalore",
                "Delhi",
                12345
        );

        System.out.println("\nRAILWAY TICKET");
        System.out.println(railwayTicket1.passengerName);
        System.out.println(railwayTicket1.trainName);
        System.out.println(railwayTicket1.source);
        System.out.println(railwayTicket1.destination);
        System.out.println(railwayTicket1.ticketNumber);

        System.out.println(railwayTicket2.passengerName);
        System.out.println(railwayTicket2.trainName);
        System.out.println(railwayTicket2.source);
        System.out.println(railwayTicket2.destination);
        System.out.println(railwayTicket2.ticketNumber);


        // Map
        Map map1 = new Map();
        Map map2 = new Map("India", "Karnataka", "Bangalore", 50000, "Road Map");

        System.out.println("\nMAP");
        System.out.println(map1.country);
        System.out.println(map1.state);
        System.out.println(map1.city);
        System.out.println(map1.scale);
        System.out.println(map1.type);

        System.out.println(map2.country);
        System.out.println(map2.state);
        System.out.println(map2.city);
        System.out.println(map2.scale);
        System.out.println(map2.type);


        // Application
        Application application1 = new Application();
        Application application2 = new Application(
                "WhatsApp",
                "2.25",
                "Meta",
                100,
                "Android"
        );

        System.out.println("\nAPPLICATION");
        System.out.println(application1.name);
        System.out.println(application1.version);
        System.out.println(application1.developer);
        System.out.println(application1.size);
        System.out.println(application1.platform);

        System.out.println(application2.name);
        System.out.println(application2.version);
        System.out.println(application2.developer);
        System.out.println(application2.size);
        System.out.println(application2.platform);


       
        ChairProduct chairProduct1 = new ChairProduct();
        ChairProduct chairProduct2 = new ChairProduct("Godrej", "Brown", "Wood", 18, 2500);

        System.out.println("\nCHAIR");
        System.out.println(chairProduct1.brand);
        System.out.println(chairProduct1);
        System.out.println(chairProduct1.material);
        System.out.println(chairProduct1.height);
        System.out.println(chairProduct1.price);

        System.out.println(chairProduct2.brand);
        System.out.println(chairProduct2.color);
        System.out.println(chairProduct2.material);
        System.out.println(chairProduct2.height);
        System.out.println(chairProduct2.price);
    }
}