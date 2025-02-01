class student{
	String name;
	int rollno;
	String college;
	int fee;
	int math;
	int science;
	int english;
	public  student(String name, int rollno, String college, int fee, int math, int science, int english) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.college = college;
		this.fee = fee;
		this.math = math;
		this.science = science;
		this.english = english;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	@Override
	public String toString() {
		return "students {\n \"name\":\"" + name + "\","+ "\" rollno\":" + rollno + ","
    + "\" college\":" + college + ","+ "\"fee\":" + fee + ","
	+ "\" math\":"+ math + ",\" science=\":" + science + ", \"english\":" + english + "}\n";
	}	
}


