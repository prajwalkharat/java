


class Outer{
	Object m1(){
		System.out.println("In m1-oter");
		class Inner{
			void m1(){
				System.out.println("in m1-Inner ");
			}
		}
		Inner obj= new Inner();
		return obj;
	}
}
class Client{
	public static void main(String[] args){
		Outer obj=new Outer();
		Inner obj1=obj.m1();
	}
}

	
