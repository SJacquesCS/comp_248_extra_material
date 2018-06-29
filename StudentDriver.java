import java.lang.Math;

public class StudentDriver {

	public static void main(String[] args) {
		Student s_1 = new Student();
		
		s_1.setAge(25);
		s_1.setGender("male");
		
		System.out.println(s_1);
		
		Student s_2 = new Student(36, "female");
		
		System.out.println(s_2);
		
		for (int i = 0; i < s_2.getGrades().length; i++) {
			s_2.setGradeAtindex(i, (int)(Math.random() * 100) + 1);
		}
		
		s_2.printGrades();
	}

}
