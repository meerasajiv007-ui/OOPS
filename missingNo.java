import java.util.Scanner;
public class missingNo {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the total number of elements(N)");
		int n=sc.nextInt();
		int s1=n*(n+1)/2;
		System.out.println("enter"+n+"numbers with one number missing");
		int s2=0;
		for (int i=0;i<n-1;i++){
			int num=sc.nextInt();
			s2+=num;
		}
		int mn=s1-s2;
		System.out.println("the missing number is:"+mn);
	}

}
