class Runner {

    public static void main(String[] values) {

        Tape tape1 = new Tape("Red", 10, "Plastic", 50);
        Tape tape2 = new Tape("Blue", 20, "Paper", 80);

        tape1.TapeInfo();
        tape2.TapeInfo();

        System.out.println("----------");

        Clinic clinic1 = new Clinic("City Clinic", "Bangalore", 5, 100);
        Clinic clinic2 = new Clinic("Health Clinic", "Mysore", 10, 200);

        clinic1.ClinicInfo();
        clinic2.ClinicInfo();

        System.out.println("----------");

        Factory factory1 = new Factory("ABC Factory", "Bangalore", 100, "Cars");
        Factory factory2 = new Factory("XYZ Factory", "Mysore", 200, "Machines");

        factory1.FactoryInfo();
        factory2.FactoryInfo();

        System.out.println("----------");

        Nest nest1 = new Nest("Small", "Tree", 3, "Sparrow");
        Nest nest2 = new Nest("Large", "Forest", 5, "Eagle");

        nest1.NestInfo();
        nest2.NestInfo();

        System.out.println("----------");

        Zip zip1 = new Zip("Black", 10, "Metal", 20);
        Zip zip2 = new Zip("White", 15, "Plastic", 30);

        zip1.ZipInfo();
        zip2.ZipInfo();

        System.out.println("----------");

        Curtain curtain1 = new Curtain("Red", "Cotton", 8, 500);
        Curtain curtain2 = new Curtain("Blue", "Silk", 10, 1000);

        curtain1.CurtainInfo();
        curtain2.CurtainInfo();

        System.out.println("----------");

        RailwayTrack railwayTrack1 = new RailwayTrack("Single", "Bangalore", 100, 2);
        RailwayTrack railwayTrack2 = new RailwayTrack("Double", "Mysore", 200, 4);

        railwayTrack1.RailwayTrackInfo();
        railwayTrack2.RailwayTrackInfo();

        System.out.println("----------");

        SwimmingPool swimmingPool1 = new SwimmingPool("City Pool", "Bangalore", 50, 6);
        SwimmingPool swimmingPool2 = new SwimmingPool("Club Pool", "Mysore", 100, 8);

        swimmingPool1.SwimmingPoolInfo();
        swimmingPool2.SwimmingPoolInfo();

        System.out.println("----------");

        WeldingMachine weldingMachine1 = new WeldingMachine("Bosch", 500, "Arc", 5000);
        WeldingMachine weldingMachine2 = new WeldingMachine("Tata", 700, "MIG", 8000);

        weldingMachine1.WeldingMachineInfo();
        weldingMachine2.WeldingMachineInfo();

        System.out.println("----------");

        Anklet anklet1 = new Anklet("Silver", "Silver", 10.5, 2000);
        Anklet anklet2 = new Anklet("Gold", "Gold", 15.5, 50000);

        anklet1.AnkletInfo();
        anklet2.AnkletInfo();
    }
}