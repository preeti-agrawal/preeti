package design_pattern;

public class lazyInitializedSingleton {
	//Singleton- single to n(single object will be created for an application)
	//developer should use only one object
	//developer cannot create the instance accidentely
	
	public static void main(String[] args) {
		Singleton_CoffeeVendingmc1 singleton_CoffeeVendingmc =Singleton_CoffeeVendingmc1.getInstance();
		singleton_CoffeeVendingmc.brewACupOfCoffee();
		Singleton_CoffeeVendingmc1 singleton_CoffeeVendingmc1 =Singleton_CoffeeVendingmc1.getInstance();
		singleton_CoffeeVendingmc1.brewACupOfCoffee();

		System.out.println(singleton_CoffeeVendingmc);
		System.out.println(singleton_CoffeeVendingmc1);
	}
	
}
	 class Singleton_CoffeeVendingmc1 {
		//Step:1 : create a veriable which is 1. private 2 static, 3 final
		private static Singleton_CoffeeVendingmc1 INSTANCE_SINGLETON_COFFEE_VENDINGMC =
				new Singleton_CoffeeVendingmc1();
	 
	//	step 2: creayt a private constructor
		private Singleton_CoffeeVendingmc1() {
	}
		//step3: create the accessor to access the instance
		public static Singleton_CoffeeVendingmc1 getInstance() {
			if(INSTANCE_SINGLETON_COFFEE_VENDINGMC==null)
			INSTANCE_SINGLETON_COFFEE_VENDINGMC =new Singleton_CoffeeVendingmc1();
			return INSTANCE_SINGLETON_COFFEE_VENDINGMC;
			
		}
		//business methods
		
		public void brewACupOfCoffee() {
			System.out.println("ahot cup");
		}

}
