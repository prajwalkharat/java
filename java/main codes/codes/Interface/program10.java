

interface Demo{
	static  void fun(){
		System.out.println("in fun demo");
	}
}
class DemoChild implements Demo{


}
class Client10{
	public static void main(String[] args){
		Demo obj=new DemoChild();
		obj.fun();
	}
}



