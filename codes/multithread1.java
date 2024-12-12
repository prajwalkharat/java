class mythread extends Thread{
	
	public void run(){
	
		for(int i=0;i<10;i++){
			System.out.println("in run");
		}
	}
}
class threadDemo{
	
	public static void main(String[] args){
		
		mythread obj = new mythread();
		obj.start();

		for(int i=1;i<10;i++){
			System.out.println("in main");
		}
	}
}
