



class parent2{
	static{
		System.out.println("in parent constructur");
	}
}
class child2 extends parent2{
	static{
		System.out.println("in static constructur");
	}
}
class client2 {
	public static void main(String[] args){
		child obj=new child();
	}
}

