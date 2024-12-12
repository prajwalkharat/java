import java.util.*;
class SapremException extends Exception {

	SapremException(String msg) {

		super(msg);
	}
}

class Demo {

	public static void main(String [] ecc) {

		Scanner sc = new Scanner(System.in);

		int chaine = 0;
		int pritam = 24;

		if(chaine == 0) {

			try {
				throw new SapremException("Atta Hagayala Kase Jau !");
			}catch(Exception e) {
	
				System.out.println(e.getMessage());
			}
		}else
			System.out.println("Gu kha");
	}
}
