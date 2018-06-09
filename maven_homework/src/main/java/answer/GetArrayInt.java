package answer;

import java.util.Scanner;

public class GetArrayInt {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of an Array?: ");
        int num = input.nextInt();
        System.out.println("Entered the element "+num+" of an Array");
        int[] numbers = new int[num];
        for (int i = 0; i < numbers.length; i++)
        {
            System.out.print("Please enter number "+i+": ");
            numbers[i] = input.nextInt();
        }
        for (int i = 0; i < numbers.length; i++)
        {
            if (num == numbers[i]){
                System.out.print(numbers[i]+"\t");
            }
        }
	}
}
