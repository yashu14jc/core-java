class Projector
{
    String models="latest";
    double price=15000.0;
    String brand="Sony";
	String colour="blue";
	String audio="Built-in-speaker";
	
	
	public Projector(){
		
		System.out.println("no args of projector");
		
		
	}
	
	
	public Projector(String models,double price, String brand, String colour, String audio){
		
		
		this.models = models;
        this.price = price;
        this.brand = brand;
        this.colour = colour;
        this.audio = audio;
		
		
		
	}
     public void display()
	 {
		System.out.println(models);
		System.out.println(price);
		System.out.println(brand);
		System.out.println(colour);
		System.out.println(audio);
		
		 
	 }

	 public void turnOn() {
        System.out.println("Projector is ON");
	 }
	 
	 public void turnOff() {
        System.out.println("Projector is OFF");
	   }
	 
}