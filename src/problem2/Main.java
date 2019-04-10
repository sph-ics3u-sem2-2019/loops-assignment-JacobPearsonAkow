package problem2;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// Read in two numbers. Add up all the values between them
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		int num1=in.nextInt();
		int bang=0;
		
		if (num1 >= num) {
			while (num<=num1) {
				bang=bang+num;
				num++;
				}	
		} else	{
			while (num>num1) {
				bang=bang-num;
				num--;
			}
		}
		
		System.out.println(bang);
		
		
		
	if (num1 >= num) {
		for (num<=num1;num++) {
			bang=bang+num;
		}
	} else { 
		for (num>num1;num--) {
			bang=bang-num;
		}
	}
		
		
		
		
		
		
		

}
}