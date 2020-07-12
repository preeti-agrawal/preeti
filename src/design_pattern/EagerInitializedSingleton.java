package design_pattern;

public class EagerInitializedSingleton {
	//Singleton- single to n(single object will be created for an application)
	//developer should use only one object
	//developer cannot create the instance accidentely
	
	public static void main(String[] args) {
		Singleton_CoffeeVendingmc singleton_CoffeeVendingmc =Singleton_CoffeeVendingmc.getInstance();
		singleton_CoffeeVendingmc.brewACupOfCoffee();
		System.out.println(singleton_CoffeeVendingmc);
	}
	
}
	 class Singleton_CoffeeVendingmc {
		//Step:1 : create a veriable which is 1. private 2 static, 3 final
		private static final Singleton_CoffeeVendingmc INSTANCE_SINGLETON_COFFEE_VENDINGMC =
				new Singleton_CoffeeVendingmc();
	 
	//	step 2: creayt a private constructor
		private Singleton_CoffeeVendingmc() {
	}
		//step3: create the accessor to access the instance
		public static Singleton_CoffeeVendingmc getInstance() {
			return INSTANCE_SINGLETON_COFFEE_VENDINGMC;
			
		}
		//business methods
		
		public void brewACupOfCoffee() {
			System.out.println("ahot cup");
		}

}
