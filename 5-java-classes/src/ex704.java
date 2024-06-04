public class ex704 {

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		
		s1.id = 20221004;
		s1.name= "유재석";
		s1.printInfo();
		
		s2.insertRecord(20021004, "마동석");
		s2.printInfo();
		
		Student s3 = new Student(20221004,"김동주");
		s3.printInfo();
	}

}
