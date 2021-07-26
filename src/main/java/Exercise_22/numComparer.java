package Exercise_22;

import java.util.Scanner;

public class numComparer {
    public static void main(String[] args) {
        int num1, num2, num3, compare = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        num2 = input.nextInt();
        System.out.print("Enter the third number: ");
        num3 = input.nextInt();
        if (num1==num2||num1==num3){
            System.out.print("There are at least two numbers that are the same. exit.");
        }
        else {
            if (compare < num1) {
                compare = num1;
            }
            if (compare < num2) {
                compare = num2;
            }
            if (compare < num3) {
                compare = num3;
            }
            System.out.println("The largest number is " + compare + ".");
        }
    }
}
