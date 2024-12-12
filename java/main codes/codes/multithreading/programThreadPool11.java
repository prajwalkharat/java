import java.util.concurrent.*;

class Mythread implements Runnable{
	int num=0;
	Mythread(int num){
		this.num=num;
	}
	public void run(){
		System.out.println(Thread.currentThread()+"Start Thread :"+num);
		dailytask();
		System.out.println(Thread.currentThread()+"End Thread :"+num);
	}
	void dailytask(){
		try{
			Thread.sleep(5000);
		}
		catch(InterruptedException ie){
			System.out.println(ie.toString());
		}
	}
}
class ThreadPoolDemo{
	public static void main(String[] args){
		ExecutorService ser=Executors.newFixedThreadPool(3);
		for(int i=1;i<=6;i++){
			Mythread obj=new Mythread(i);
			ser.execute(obj);
		}
		ser.shutdown();
	}
}
	    

