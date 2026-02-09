import java.util.Scanner;
public class Sum {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter a number:");
		int num=sc.nextInt();
		while(num>=10) {
			int sum=0;
			while(num>0) {
				sum+=num%10;
				num/=10;
			}
			num=sum;
		}
		System.out.println("The single-digit sum is: " + num);
		sc.close();
	}

}
