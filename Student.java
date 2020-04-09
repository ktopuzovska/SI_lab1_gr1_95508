class Student {
	String index;
	String firstName;
	String lastName;

	int[] labPoints = {1, 2, 3, 4, 5};

	// Constructors
	public Student() {
		index = 0;
		firstName = ""
		lastName = "";
	}

	public Student(String indexNum, String name, String surname, int[] points) {
		index = indexNum;
		firstName = name;
		lastName = surname;
		labPoints = points;
	}

	// Getter
	public String getIindex() {
		return index;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getLabPoints() {
		return labPoints;
	}

	// Setter
	public void setIndex(String newIndex) {
		this.index = newIndex;
	}

	public void setFirstName(String newFirstName) {
		this.index = newFirstName;
	}

	public void setLastName(String newLastName) {
		this.index = newLastName;
	}

	public void setLabPoints(int[] newLabPoints) {
		this.labPoints = newLabPoints;
	}

	public double getAverage() {
		int sum = 0
		for (int i = 0; i < labPoints.length ;i++ ) {
			sum += labPoints[i];
		}
		return sum / labPoints.length;
	}

	public boolean hasSignature() {
		return labPoints.length > 8
	}
}
