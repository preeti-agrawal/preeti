package design_pattern;

public class EagerInitializedStaticBlockSingleton {
	

	//Singleton- single to n(single object will be created for an application)
	//developer should use only one object
	//developer cannot create the instance accidentely
	
	public static void main(String[] args) {
		System.out.println("framework is loaded");
		
		try {
			Class.forName("design_patterns.Singleton_CoffeeVendingmc3");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		Singleton_CoffeeVendingmc2 singleton_CoffeeVendingmc1 =Singleton_CoffeeVendingmc2.getInstance();
//		singleton_CoffeeVendingmc1.brewACupOfCoffee();
//		System.out.println(singleton_CoffeeVendingmc1);
	}
	
}
	 class Singleton_CoffeeVendingmc3 {
		//Step:1 : create a veriable which is 1. private 2 static, 3 final
		private static final Singleton_CoffeeVendingmc3 INSTANCE_SINGLETON_COFFEE_VENDINGMC =
				new Singleton_CoffeeVendingmc3();
	 
	//	step 2: creayt a private constructor
		private Singleton_CoffeeVendingmc3() {
	}
		//step3: create the accessor to access the instance
		public static Singleton_CoffeeVendingmc3 getInstance() {
			return INSTANCE_SINGLETON_COFFEE_VENDINGMC;
			
		}
		//business methods
		
		public void brewACupOfCoffee() {
			System.out.println("ahot cup");
		}

}
