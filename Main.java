import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double a, b;
		System.out.print("Enter Two Numbers: ");
		a = sc.nextDouble();
		b = sc.nextDouble();
		System.out.print("\nChoice of Operation: "+
				"\n1. Addition" +
				"\n2. Subtraction" +
				"\n3. Multiplication" +
				"\n4. Division"+
				"Enter: ");
		int choice = sc.nextInt();
		System.out.print("Ans: ");
		if(choice == 1){
			System.out.print(Addition.add(a, b));
		}
		else if(choice == 2){
			System.out.print(Subtraction.subtract(a, b));
		}
		else if(choice == 3){
			System.out.print(Multiplication.multiply(a, b));
		}
		else if(choice == 4){
			System.out.print(Division.divide(a, b));
		}

	}
}