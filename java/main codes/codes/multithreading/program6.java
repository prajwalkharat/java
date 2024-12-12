


class Mythread extends Thread{
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println("In-thread-0");
		}
	}
}
class ThreadDemo6{
	public static void main(String[] args)throws Exception{
		Mythread obj=new Mythread();
		obj.start();
		obj.join();
		for(int i=1;i<=10;i++){
			System.out.println("In-main thread");
		}
	}
}
