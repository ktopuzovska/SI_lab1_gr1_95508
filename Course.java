class Course {
	List<Student> students;

	// Constructors
	public Course() {
		students = new ArrayList<Student>();
	}

	public Course(List<Student> newStudents) {
		students = newStudents;
	}

	public void addStudent(Student studentToAdd) {
		students.add(studentToAdd);
	}

	public void removeStudent(Student studentToRemove) {
		int studentIndex = students.indexOf(studentToRemove)
		students.remove(studentIndex);
	}
}
