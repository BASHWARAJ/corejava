package gradingSystem;

import java.util.Scanner;



public class mainthreenum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        
        Threenum findgreatest=new Threenum();
        findgreatest.FindGreatest(num1, num2, num3);
        		

        int greatest = findGreatest(num1, num2, num3);

        System.out.println("The greatest number is: " + greatest);

        scanner.close();
    }

	private static int findGreatest(int num1, int num2, int num3) {
		// TODO Auto-generated method stub
		return 0;
	}
}
