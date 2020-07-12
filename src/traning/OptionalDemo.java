package traning;




import java.util.ArrayList;
import java.util.Optional;
public class OptionalDemo {
	static String testString = null;
	public static void main(String[] args) {
		Person person = null;
		ArrayList arrayList = null;
		Integer numbers[] = null;
		if (Math.random() > 0.5) {
			numbers = new Integer[3];
			numbers[0] = 100;
			testString = "null";
			person = new Person();
			arrayList = new ArrayList();
			//arrayList.add("null");
		}
		Optional optionalString = Optional.ofNullable(arrayList);
		if (optionalString.isPresent()) {
			System.out.println(arrayList.size());
			int length = optionalString.get().toString().length();
			System.out.println(length);
		} else {
			System.out.println("Array List may be null!");
		}
	}
}
class Person {
	private String name = "Tester";
	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
}


