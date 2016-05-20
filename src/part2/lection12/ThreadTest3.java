package part2.lection12;

public class ThreadTest3 {

	private static int mNum=12;


    public static void main(String[] args) {
        mNum=13;
		Runnable runner = new Runnable(){
                    @Override
					public void run(){
                        mNum++;
              	        System.out.println("Thread " +
                                Thread.currentThread().getName() + ", mNum ="+mNum);
                    }
		};

		//стартуємо три потоки
		for (int i=0; i<3; i++)
			(new Thread (runner)).start();

		System.out.println("Main Thread, mNum ="+mNum);
	}
	    
}
