package stream;

import java.util.ArrayList;
import java.util.List;

public class ParallelStreamPerformanceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sequentialStream();
	}
	
	
		private static long sequentialStream() {
			// create the source list
			List<Integer> productList = new ArrayList<Integer>();

			productList.add(1000);
			for (int i = 0; i < 100; i++) {
				int lastValue = productList.get(i);
				productList.add(lastValue + 1000);
			}
			System.out.println("BEFORE PROCESSING " + productList);
			//System.out.println("Input List ---> " + productList);

			List serialList = new ArrayList();
			productList.stream().filter(element->(element >5000 &&element<10000)).forEach(System.out::println);
			return 0;
		}
	}


