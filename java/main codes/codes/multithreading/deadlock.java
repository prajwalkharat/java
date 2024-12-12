
class Mythread extends Thread{
	static Thread nmMain=null;
	public void run(){
		try{
			nmMain.join();
		}
		catch(InterruptedException obj){
		}
		for(int i=0;i<=10;i++){
			System.out.println("Inthread0");
		}
	}
}
class ThreadDemo7{
	public static void main(String[] args)throws InterruptedException{
		Mythread.nmMain=Thread.currentThread();
                Mythread obj=new Mythread();
		obj.start();
		obj.join();
		for(int i=0;i<=10;i++){
			System.out.println("In-main");
		}
	}
}
