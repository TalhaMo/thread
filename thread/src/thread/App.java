package thread;

class MyCounter extends Thread{
	private int threadNo;

	public MyCounter(int threadNo) {
		this.threadNo = threadNo;
	}

	public int getThreadNo() {
		return threadNo;
	}
	public void countMe() {
		for(int i=1;i<=9;i++) {
			try {
				sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("value of i "+i+" thread no "+threadNo);
		}
	}
	@Override
	public void run() {
		countMe();
	}
}

public class App {

	public static void main(String[] args) throws InterruptedException {
		
		MyCounter count1=new MyCounter(1);
		
		MyCounter count2=new MyCounter(2);
		long startTime =System.currentTimeMillis();
		count1.start();
		System.out.println("*************************");
		count2.start();
		//Thread.sleep(4600);
		long endTime =System.currentTimeMillis();
		System.out.println("total time of the process: "+(endTime-startTime));

	}

}
