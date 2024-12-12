

class Mythread implements Runnable{
	public void run(){
	     System.out.println(Thread.currentThread());
	     try{
		   Thread.sleep(5000);
	     }catch(InterruptedException ie){
                System.out.println(ie.toString());
	     }
	}
}
class ThreadGroupDemo3{
	public static void main(String[] args){
		ThreadGroup pthreadGp=new ThreadGroup("India");
		Mythread obj1=new Mythread();
		Mythread obj2=new Mythread();

		Thread t1=new Thread(pthreadGp,obj1,"Maha");
		Thread t2=new Thread(pthreadGp,obj2,"Goa");

		t1.start();
		t2.start();
	}
}

