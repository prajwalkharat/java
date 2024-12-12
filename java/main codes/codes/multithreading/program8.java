
class Mythread extends Thread{
	Mythread(ThreadGroup tg,String str){
		super(tg,str);
	}
	public void run(){
		System.out.println(currentThread());
	}
}
class ThreadGroupDemo{
	public static void main(String[] args){
		ThreadGroup pthreadGp=new ThreadGroup("core2web");
		Mythread obj=new Mythread(pthreadGp,"c");
		Mythread obj1=new Mythread(pthreadGp,"java");
		Mythread obj2=new Mythread(pthreadGp,"python");
		obj.start();
		obj1.start();
		obj2.start();

		ThreadGroup cthreadGp=new ThreadGroup(pthreadGp,"Incubuter");
		Mythread obj4=new Mythread(cthreadGp,"flutter");
		Mythread obj5=new Mythread(cthreadGp,"Reactjs");
		Mythread obj6=new Mythread(cthreadGp,"springboot");

		obj4.start();
		obj5.start();
		obj6.start();

	}
}


