package ExceptionHanding;

import java.io.IOException;

import java.util.*;

public class ExeptionMain {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		while (true) {

			try {

				System.out.print("Enter numerator: ");

				Integer numerator = scanner.nextInt();

				System.out.print("Enter  denominator: ");

				Integer denominator = scanner.nextInt();

				// test denominator is not zero

				if (denominator == 0) {

					throw new DivZeroException("Divisor zero is not allowed!");

				}

				Integer result = numerator / denominator;

				System.out.println("Result is " + result);

				System.exit(0);

			} catch (DivZeroException e) {

				System.out.println("Error caught: " + e.getMessage());

				System.out.println();

			} catch (InputMismatchException errorInput) {

				System.out.println("Enter only integer!");

				scanner.nextLine();

			}

		}

	}

}
