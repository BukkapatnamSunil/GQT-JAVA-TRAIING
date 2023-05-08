package PatternProgram;
import java.util.Scanner;
public class Universal_pattern {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		for(int i=0;i<=n-1;i++) {
			for(int j=0;j<=n-1;j++) {
				if(i==0 || (i==(n-1))/*first and last row*/
					||j==0 ||(j==(n-1))/*first and last Column*/
					||(i==n/2)||(j==n/2)/*middle row and  Column*/
					||(i==j)/*first long daigonal(left to right)*/
					||(i+j==n-1)/*second long daigonal(right to left)*/
					||(i+j==n/2)/*first small daigonal(top right to top left)*/
					||(j-i==n/2)/*second small daigonal(top left to top right)*/
					||(i-j==n/2)/*third small daigonal(bottom right to bottom left)*/
					||(i+j==(n-1)+n/2)
				) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
