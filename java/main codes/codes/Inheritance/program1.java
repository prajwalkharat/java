



class ICC{
	ICC(){
		System.out.println("in icc constructor");
	}
}
class BCCI extends ICC{
	BCCI(){
		System.out.println("In BCCI consructor");
	}
}
class client{
	public static void main(String[] args){
		BCCI jayshah=new BCCI();
	}
}

