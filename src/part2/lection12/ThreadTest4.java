package part2.lection12;


public class ThreadTest4 {

	private int a=1, b=2;
	  public void one() {
	    a=b;
	  }
	  public void two() {
	    b=a;
	  }

	  public static void main(String s[]) {
	    int a11=0, a22=0, a12=0;
	    for (int i=0; i<100; i++) {
	      final ThreadTest4 o = new ThreadTest4();

	      // Запускаем первый поток, который
	      // вызывает один метод
	      new Thread() {
	          @Override
			public void run() {
	            o.one();
	          }
	      }.start();

	      // Запускаем второй поток, который
	      // вызывает второй метод
	      new Thread() {
	         @Override
			public void run() {
	           o.two();
	         }
	      }.start();

	      // даем потокам время отработать 
	      try {
	         Thread.sleep(100);
	      } catch (InterruptedException e) {}

	      // анализируем финальные значения
	      if (o.a==1 && o.b==1) a11++;
	      if (o.a==2 && o.b==2) a22++;
	      if (o.a!=o.b) a12++;
	    }
	    System.out.println(a11+" "+a22+" "+a12);
	  }
	
}
