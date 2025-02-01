		import java.util.ArrayList;

public class StudentDb {
	public static void main(String[] args) {
	
		ArrayList<student> stuList = 
				new ArrayList<student>();
		student stu=null;
		for(int i=1;i<=500000;i++) {
			
			stu = new student(
					"Stu"+i
					,GeneratedRandom.getNo(13000, 28000),"StPeters",
					GeneratedRandom.getNo(3000, 65000),
					GeneratedRandom.getNo(13,100),
					GeneratedRandom.getNo(23,89),
					GeneratedRandom.getNo(20,78)
					);
			
			stuList.add(stu);
		
		}
		
		System.out.println(stuList);
		
		
		
		
		
		
		
	}

}