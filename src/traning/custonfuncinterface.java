package traning;

public class custonfuncinterface {

	public static void main(String[] args) {
		Integer[] intarrayIntegers = {5,6,7,8,};
		Counter counter = Utils::countElementsInstance;
		System.out.println(counter.count(intarrayIntegers));
	}
}


@FunctionalInterface
interface Counter {
	int count(Object[] objArray);
}

class Utils {
	
	public static int countElementsInstance(Object[] array) {
		return array.length;
}
}

