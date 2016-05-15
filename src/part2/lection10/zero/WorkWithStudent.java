package part2.lection10.zero;

class Student{
	private String name;

	public Student(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
}

public class WorkWithStudent {

	public String workWithStudent(Student student){
		return student.getName();
	}
	
	public static void main(String[] args) {
		Student first = new Student("Ivan");
		WorkWithStudent wws = new WorkWithStudent();
		System.out.println(wws.workWithStudent(first));
		
		Student second=null;
		System.out.println(wws.workWithStudent(second));
	}

}
