


class Mythread extends Thread{
	public void run(){
	    System.out.println(currentThread());
	    System.out.println(getName());
	}
}
class ThreadDemo5{
	public static void main(String[] args)throws InterruptedException{
		  System.out.println(Thread.currentThread());
		  Mythread obj=new Mythread();
		  obj.start();
		  Thread.sleep(100);
		  Thread.currentThread().setName("core2web");
		  System.out.println(Thread.currentThread().getName());
	}
}


