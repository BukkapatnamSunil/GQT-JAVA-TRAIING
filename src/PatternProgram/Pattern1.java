package PatternProgram;
import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
//		for(int i=0;i<=5;i++) {
//			System.out.print("$");
//		}
//		for(int i=0;i<=5;i++) {
//			System.out.print("1");
//		}
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of n");
		int n=sc.nextInt();
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n;j++) {
//				System.out.print("$");
//			}
//			System.out.println();
//		}
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n;j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
//		int count=1;
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n;j++) {
//				System.out.print(count+" ");
//				count++;
//			}
//			System.out.println();
//		}
//		int count=25;
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n;j++) {
//				System.out.print(count+" ");
//				count--;
//			}
//			System.out.println();
//		}
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n;j++) {
//				System.out.print("$");
//			}
//			for(int j=1;j<=n;j++) {
//				System.out.print("#");
//			}
//			System.out.println();
//		}
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("@");
//			}
//			System.out.println();
//		}
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=n-i+1;j++) {
//				System.out.print("@");
//			}
//			System.out.println();
//		}
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(i);
//			}
//			System.out.println();
//		}
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(j);
//			}
//			System.out.println();
//		}
//		int count=1;
//		for(int i=1;i<=n;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(count+" ");
//				count++;
//			}
//			System.out.println();
//		}
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("&");
			}
			for(int j=1;j<=n;j++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}

}
