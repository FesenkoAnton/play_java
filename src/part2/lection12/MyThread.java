package part2.lection12;

class MyThreadTest extends Thread{

	@Override
	public void run(){
		long sum = 0;
		for (int i=0;i<1; i++){
			sum+=i;
		}
		System.out.println(sum);
	}
	
}

public class MyThread {
	
	public static void main(String[] args){
		MyThreadTest t = new MyThreadTest();
		t.start();
		
		System.out.println("kd");
	}
	
}