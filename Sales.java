class Sales{
	public static double getCostByProductName(String productName){
		
		System.out.println("Running getCostByProductName in sales");
		
		System.out.println("Product Name:"+productName);
		
		return 650.65;
	}
	public static double getWeightByProductNameAndBrand(String productName,String brand){
		
		System.out.println("Running getWeightByProductNameAndBrand in Sales");
		
		System.out.println("Product Name:"+productName);
		System.out.println("Brand:"+brand);
		
		return 1.25;
	}
	public static double getWarrantyByProductNameAndBrand(String productName,String brand){
		
		System.out.println("Running getWarrantyByProductNameAndBrand in Sales");
		
		System.out.println("Product Name:"+productName);
		System.out.println("Brand:"+brand);
		
		return 15;
	}
	public static void main(String[] args){
		
		double cost=Sales.getCostByProductName("Pressure cooker");
		System.out.println("Cost:"+cost);
		System.out.println();
		
		double weight=Sales.getWeightByProductNameAndBrand("Pressure cooker","Butterfly");
		System.out.println("Weight:"+weight+" KG");
		System.out.println();
		
		double warranry=Sales.getWarrantyByProductNameAndBrand("Pressure cooker","Butterfly");
		System.out.println("Warranty:"+warranry+" Months");
		System.out.println();
		
		
	}
}
		
		
		
		
		
		
	
		
		
	
