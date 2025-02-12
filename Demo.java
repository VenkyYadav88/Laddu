import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
System.out.println("enter total buildings");
	Scanner sc=new Scanner(System.in);
	int total =sc.nextInt();
	int[] h=new int[total];
	for (int i=0;i<total;i++) {
		System.out.println("enter building height.....");
	h[i]=sc.nextInt();
	}
	int max=h[0];
	int count=1;
	for(int i=1;i<h.length;i++) {
		if(h[i]>max) {
			count++;
				
		}
	}
	
	}

}
