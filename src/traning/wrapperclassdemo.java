package traning;

import java.util.ArrayList;
import java.util.List;

public class wrapperclassdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	primitivetype();
		primitiveTypeCollections();
		
		 
		

	}
	private static void primitiveTypeCollections() {
		double d =200.50;
		char ch ='a';
		int i = 500;
		List list =new ArrayList();
		list.add(d);
		list.add(ch);	
		list.add(i);
		//HashMap hashMap =new HashMap();
		
		
			System.out.println(list);
		
	}

	private static void primitivetype() {
		double d =200.50;
		char ch ='a';
		int i = 500;
		Object object[] = new Object[2];
		object[0] = new Double(d);
		object[1] = new Character(ch);
		
		for(Object j:object) {
			System.out.println(j);
			
		}
	}

}
