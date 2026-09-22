class ProjectorRunner{



	public static void main(String[] values) {

        Projector projector = new Projector("latest", 15000.0, "Sony", "blue","Built-in-speaker");

        projector.display();
        projector.turnOn();
		projector.turnOff();
		


	}
}