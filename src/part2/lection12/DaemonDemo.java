package part2.lection12;

class DaemonDemo extends Thread {
	   public DaemonDemo() {
	      super("Daemon demo thread");
	      setDaemon(true);
	      start();
	   }

	   @Override
	public void run() {
	      Thread threads[]=new Thread[10];
	      while (true) {
	    	// Отримуємо набір всіх потоків з
		    // тестової групи
	         int count=ThreadTest2.GROUP.activeCount();
	         if (threads.length<count) threads = new Thread[count+10];
	         count=ThreadTest2.GROUP.enumerate(threads);

	         // Роздруковуємо ім'я кожного потоку
	         for (int i=0; i<count; i++) {
	            System.out.print(threads[i].getName()+", ");
	         }
	         System.out.println();
	         try {
	            Thread.sleep(300);
	         } catch (InterruptedException e) {}
	      }
	   }
	} 
