package part2.lection10.zero;

public class WorkWithStudentGood {
	
	public String workWithStudent(Student student){
		if (student == null){
			throw new NullPointerException("вказівник на не існуючого студента");
		}
		
		return student.getName();
	}
	
	public static void main(String[] args) {
		Student first = new Student("Ivan");
		WorkWithStudentGood wws = new WorkWithStudentGood();
		String res = wws.workWithStudent(first);
		System.out.println(res);
		
		Student second=null;
		res = wws.workWithStudent(second);
		System.out.println(res);
	}
}
