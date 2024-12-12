

class MyThread extends Thread{
	public void run(){
		for(int i=0;i<=10;i++){
			System.out.println("In run");
		}
	}
	public void start(){
		System.out.println("my thread start");
		run();
	}

}
class ThreadDemo1{
	public static void main(String[] args)throws InterruptedException{
		System.out.println(Thread.currentThread().getName());

	       MyThread obj=new MyThread();
	       obj.start();
	       for(int i=1;i<=10;i++){
		       System.out.println("in main");
                       Thread.sleep(1000);
	       }
      }
}      

