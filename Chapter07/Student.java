package Chapter07;

public class Student extends People{
	public int stunum;
	
	/*public Student() {
		// TODO Auto-generated constructor stub
		super("","");
	}*/
	
	public Student(String name, String ssn, int stunum) {
		super(name, ssn);
		this.stunum = stunum;
	}
}
