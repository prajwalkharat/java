






class Macdi{
	int Items=5;
	String product="fries";
	void Menu(){
		String Menu1="veg";
		String Menu2="Non-veg";
		System.out.println(Items);
		System.out.println(product);
	}
}
class user{
	public static void main(String[] args){
		Macdi obj1=new Macdi();
		obj1.Menu();
	}
}
