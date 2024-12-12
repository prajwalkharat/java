
class Outer{
	class Inner{
		void m1(){
			System.out.println("inner m1");
		}
	}
	void m2(){
		System.out.println("outer m2");
	}
	public static void main(String[] args){
		Inner obj=new Outer().new Inner();
		obj.m1();
	}
}

