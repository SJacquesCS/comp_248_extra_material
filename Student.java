public class Student {
	private static int id;
	private int age;
	private String gender;
	private double[] grades;
	
	public Student() {
		id++;
		grades = new double[30];
	}
	
	public Student(int age, String gender) {
		id++;
		this.age = age;
		this.gender = gender;
		grades = new double[30];
	}

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Student.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double[] getGrades() {
		return grades;
	}

	public void setGrades(double[] grades) {
		this.grades = grades;
	}
	
	public double getGradeAtIndex(int index) {
		if (index >= 0 && index < grades.length) {
			return grades[index];
		}
		
		return 0;
	}
	
	public void setGradeAtindex(int index, double grade) {
		if (index >= 0 && index < grades.length) {
			grades[index] = grade;
		}
	}
	
	public void printGrades() {
		System.out.println("-----Here is the list of grades for student " + id + "-----");
		
		for (int i = 0; i < grades.length; i++) {
			System.out.println("Grade " + (i + 1) + ": " + grades[i] + "%");
		}
	}
	
	public String toString() {
		return "Student " + id + " is a " + age + " years old " + gender;
	}
}
