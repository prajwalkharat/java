


interface Demo{
	void fun();
	void gun();
}
class DemoChild implements Demo{
      public void fun(){
              System.out.println("fun");
	}
      public void gun(){
		 System.out.println("gun");
	}
}
class client2{
	public static void main(String[] args){
		Demo obj=new DemoChild();
		obj.fun();
		obj.gun();
	}
}


