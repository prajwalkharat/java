


class Match{
	void matchType(){
		System.out.println("T20/OneDay/Test");
	}
}
class IPLMatch extends Match{
	void matchType(){
		System.out.println("T20");
	}
}
class TestMatch extends Match{
	void matchType(){
	System.out.println("Test");
	}
}
class client6{
	public static void main(String[] args){
		IPLMatch type1=new IPLMatch();
		type1.matchType();
		TestMatch type2=new TestMatch();
		type2.matchType();
	}
}


