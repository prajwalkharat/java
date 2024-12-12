


interface Demo{
	void gun();
	default void fun(){
		System.out.println("in fun demo");
	}
}
class DemoChild implements Demo{
      public void gun(){
           System.out.println("in gun demo");
      }
}
class Client8{
	public static void main(String[] args){
		Demo obj=new DemoChild();
		obj.gun();
		obj.fun();
	}
}


