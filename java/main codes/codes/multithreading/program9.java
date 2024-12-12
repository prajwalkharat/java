
class Mythread extends Thread{
	Mythread(ThreadGroup tg,String str){
		super(tg,str);
	}
	public void run(){
		 System.out.println(Thread.currentThread());
		 try{
		   Thread.sleep(5000);
		 }
		 catch(InterruptedException ie){
			 System.out.println(ie.toString());
		 }
	}
}
class ThreadGroupDemo2{
	public static void main(String[] args){
		ThreadGroup pThreadGp=new ThreadGroup("India");

		Mythread t1=new Mythread(pThreadGp,"Maha");
	        Mythread t2=new Mythread(pThreadGp,"Goa");
		t1.start();
		t2.start();

		ThreadGroup cThreadGp1=new ThreadGroup(pThreadGp,"Pakistan");

	        Mythread t3=new Mythread(cThreadGp1,"karachi");
		Mythread t4=new Mythread(cThreadGp1,"Lahore");

		ThreadGroup cThreadGp2=new ThreadGroup(pThreadGp,"Bangaladesh");

		Mythread t5=new Mythread(cThreadGp2,"Dhaka");
		Mythread t6=new Mythread(cThreadGp2,"Mirput");
		t5.start();
		t6.start();

	//	Thread.interrupted();
		System.out.println(pThreadGp.activeCount());
		System.out.println(pThreadGp.activeGroupCount());
	}
}

		


