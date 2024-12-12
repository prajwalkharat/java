class match{
	void matchType(){
		System.out.println("T20/OneDay/Test");
	}
}
class iplMatch extends match{
	void matchType(){
		System.out.println("T20");
	}
}
class testMatch extends match{
	void matchType(){
		System.out.println("Test");
	}
}
class client{
	public static void main(String[] args){
		match type1 = new iplMatch();
		type1.matchType();

		match type2 = new testMatch();
		type2.matchType();
	}

}
