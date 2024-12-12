


class Singleton{
	static Singleton obj=new Singleton();
	private Singleton(){
		System.out.println("constructure");
	}
	static Singleton getObject(){
		return obj;
	}
}
class Client1{
	public static void main(String[] args){
		Singleton obj1=Singleton.getObject();
		System.out.println(obj1);

		Singleton obj2=Singleton.getObject();
		System.out.println(obj2);

		Singleton obj3=Singleton.getObject();
	        System.out.println(obj3);
	}
}


