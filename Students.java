package assignments.week3.day1;

public class Students {
	
	public void getStudentInfo( int id) {
		
		System.out.println("Student Id is" +id );

	}
    public void getStudentInfo( int id , String name) {
		
		System.out.println("Student Id is" +id  );
		//System.out.println("Student Name is" +name);

	}
   public void getStudentInfo( String email, int phonenumber) {
		
		System.out.println("Student email is" +email);
		System.out.println("Student Number is" + phonenumber);

	}

	public static void main(String[] args) {
		
		Students stu = new Students();
		stu.getStudentInfo(23);
		stu.getStudentInfo(24, "Ranjana");
		stu.getStudentInfo("ran@gmail.com" , 983457756);

	}

}
