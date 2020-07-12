package traning;

import java.util.ArrayList;
import java.util.List;

public class Methodref {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> nameList =new ArrayList<String>();
		nameList.add("Tony");
		nameList.add("Robins");
		
		
//		
//		void accept(String item) {
//			System.out.println(item);
//		}
//		
		nameList.forEach(item -> System.out.println(item));
		
		nameList.forEach(System.out::println) ;

	}

}
