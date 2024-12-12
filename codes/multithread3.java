class mythread implements Runnable{
	
	public void run(){
		Thread t = Thread.currentThread();
		System.out.println(t.getName());
	}
}
class Threaddemo{
	
	public static void main(String[] args){
		
		

		Thread t = Thread.currentThread();
		System.out.println(t.getName());

		mythread t1 = new mythread();

		Thread obj1=new Thread(t1);
		obj1.start();

		t.setPriority(7);
		
		mythread t2 = new mythread();
		Thread obj3=new Thread(t2);
		obj3.start();
	}
}
