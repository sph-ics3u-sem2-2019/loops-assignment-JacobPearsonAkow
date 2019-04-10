package problem1;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// Read a value. Print out from 1 to the input
		Scanner in=new Scanner(System.in);

		int num=in.nextInt();
		int num1=1; 
		

		while (num1<num) {
			System.out.println(num1);
			num1++;
		}

		while (num1>num) {
			System.out.println(num1);
			num1--;
		}

System.out.println(num1);
	}
}