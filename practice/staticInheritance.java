class Parent {
    static int y = 20;
    static int x = 30;
    Parent(){
    	System.out.println("in parent const");
    }
    static {
        System.out.println("in parent static");
    }
    static void fun(){
    	System.out.println("in parent fun");
    }
}

class Child extends Parent {
  static int x = 10;
   static int y = 20;
   Child(){
    	System.out.println("in child const");
	System.out.println(super.x);
    }
    static {
        System.out.println("in child static");
	System.out.println(x);
	
    }
   static void fun(){
    	System.out.println("in child fun()");
    }
    void sir(){
    System.out.println(super.x);
    }
}

class Client { // The main class with the main method
    public static void main(String[] args) {
        Parent a = new Parent();
	a.fun();

	Child b = new Child();
	b.fun();

	Parent c = new Child();
	c.fun();
    }
}

