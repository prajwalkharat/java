
class Outer{
        class Inner{
          static class Inner2{
	     class Inner3{
	         void m1(){
	            System.out.println("innner3-m1");
	         }
	     }
          }
       }
}
class client{
	public static void main(String[] args){
           // Outer.Inner obj=new Outer.Inner();
	  //  Outer.Inner.Inner2 obj1=new Outer.Inner().new Inner2();
	   // Outer.Inner.Inner2 obj2=new Outer().new Inner().new Inner2();
	   Outer.Inner.Inner2.Inner3 obj3=new Outer().new Inner2().new Inner3(); 
	    obj3.m1();
	}
}


























//   public static void main(String[] args){
	               // Inner obj=new Inner();
		       //            // Inner.Inner2 obj1=new Inner().new Inner2();
		       //                       // obj1.m1();
		       //                                // Inner.Inner2.Inner3 obj3=new Outer().new Inner.Inner2().new Inner3();
		       //                                          //obj3.m1();
		       //                                                  }
