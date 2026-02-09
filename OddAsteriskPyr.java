import java.util.Scanner;
public class OddAsteriskPyr {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the no: of rows");
		int rows=sc.nextInt();
		for(int i=1;i<=rows;i++) {
			 for (int space = 1; space <= rows - i; space++) {
	                System.out.print(" ");
	            }
			 for(int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			 System.out.println();
		}
	}

}
