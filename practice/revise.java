
class Parent {

	int x = 10;
	final int y = 20;

	static void fun() {

		System.out.println("In Parent fun");
	}

	Parent() {

		System.out.println("In Constructor");
	}

	Parent(int x) {

		System.out.println(x);
	}

	void sun(int x,float y) {

		System.out.println("In sun Float");
	}

	void sun() {

		System.out.println("In Normal sun");
	}
}

class Child extends Parent {

	static void fun() {

		System.out.println("In Child fun");
	}

	void sun() {

		System.out.println("Child sun");
	}
}

abstract class Pappa {

	void marry();

	void education() {

		System.out.println("Doctor");
	}
}

class Beta extends Pappa{

	void marry() {

		System.out.println("GIrl");
	}
}

interface Appan {

	void marry();
	void career() ;
}

interface Sharing extends Aapan {

	void Living();
	default void career() {

		System.out.println("Doctor");
	}

	static marry() {

		System.out.println("Girl");
	}
}

class Son implements Aapan{

	
}

class Demo {

	public static void main(String [] ecc) {

		Parent p = new Parent();
		System.out.println(p.x);
		
		Child c = new Child();
		Parent obj = new Child();

		obj.fun();
	}
}

