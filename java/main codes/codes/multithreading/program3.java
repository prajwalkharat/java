



class Demo extends Thread{
	public void run(){
		System.out.println("Demo :"+Thread.currentThread().getName());
	}
}
class Mythread extends Thread {
	public void run(){
	 System.out.println("In run");
         System.out.println(Thread.currentThread().getName());
         Demo obj=new Demo();
	 obj.start();
	}
}
class ThreadDemo3{
	public static void main(String[] args){
		System.out.println(Thread.currentThread().getName());
		Mythread obj=new Mythread();
	        obj.start();
	}
}
