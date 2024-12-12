


class Employee{
	int empId=10;
	String name="kanha";
	static int y=50;
	void empInfo(){
		System.out.println(empId);
		System.out.println(name);
		System.out.println(y);
	}
}
class MainDemo{
	public static void main(String[] args){
		Employee emp1=new Employee();
		Employee emp2=new Employee();
		emp1.empInfo();
		emp2.empInfo();
		System.out.println("*********");
		emp2.empId=20;
		emp2.name="Rahul";
		emp1.y=5000;
		emp1.empInfo();
		emp2.empInfo();
	}
}
