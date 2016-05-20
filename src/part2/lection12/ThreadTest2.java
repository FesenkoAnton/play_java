package part2.lection12;

public class ThreadTest2 implements Runnable {

	   // Окрема група, в якій будуть
	   // знаходитися всі потоки ThreadTest2
	   public final static ThreadGroup GROUP = new ThreadGroup("Daemon demo");

	// Початкове значення, що вказується при створенні об'єкта
	   private int start;

	   public ThreadTest2(int s) {
	      start = (s%2==0)? s: s+1;
	      new Thread(GROUP, this, "Thread "+ start).start();
	   }

	@Override
	public void run() {
		// Починаємо зворотній відлік
	      for (int i=start; i>0; i--) {
	         try {
	            Thread.sleep(300);
	         } catch (InterruptedException e) {}
	         // По досягненню середини породжуємо
	         // новий потік з половинним початковим
	         // значенням
	         if (start>2 && i==start/2)
			 {
	           new ThreadTest2(i);
	         }
	      }
	   }

	public static void main(String s[]) {
	   new ThreadTest2(16);
	   new DaemonDemo();
   }
}

