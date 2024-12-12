

class Outer {
	void m1(){
             System.out.println("in method m1");
	     //method inner class
	     class Inner{
	     void fun(){
		    System.out.println("inner fun");
	     }
	     }
	     Inner obj=new Inner();
	     obj.fun();
	}
	void m2(){
		System.out.println("outer-m2");
	}
	public static void main(String[] args){
		Outer obj=new Outer();
		obj.m1();
		obj.m2();
	}

}


