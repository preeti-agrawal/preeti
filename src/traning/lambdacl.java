package traning;

public class lambdacl {
	
	public static void main(String[] args) {
		//threditionalThreading();
		
		//usinRunnable();
		//usinRunnable();
		//usinganonymousclass();
		//new Thread(()->System.out.println("anonymouse class")).start();
		usingLambda();
		
	}

	private static void usingLambda() {
		Runnable runnablelambda =() ->System.out.println("anonymouse class used here with lembda espression");
	Thread thread= new Thread(runnablelambda);
	thread.start();
	}

	private static void usinganonymousclass() {
		new Thread() {
			@Override 
			public void  run() {
				System.out.println("anonymous class used here for chile thread");
			}
		}.start();
	}

	private static void usinRunnable() {
		TestThreadRunnable testThreadRunnable =new TestThreadRunnable();
	   Thread thread = new Thread(testThreadRunnable);
		thread.start();
	}

	private static void threditionalThreading() {
		String threadNameString =Thread.currentThread().getName();
		System.out.println(threadNameString);
		System.out.println(Thread.currentThread().getId());
		TestThread testThread = new TestThread();
		testThread.start();
	}

}

class TestThread extends Thread{
	@Override 
	public void run() {
		Thread.currentThread().setName("Child Thread Rename");
		System.out.println(Thread.currentThread().getId());
		System.out.println("child thread: TestThread run()");
		System.out.println(Thread.currentThread().getName());
	}
}


class TestThreadRunnable implements Runnable{
	@Override
	public void run() {
		System.out.println("test");
	}
}