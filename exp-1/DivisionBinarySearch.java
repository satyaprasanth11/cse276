import java.util.Scanner;

public class DivisionBinarySearch {

    public static int divide(int dividend, int divisor) {

        if (divisor == 0) {
            System.out.println("Division by zero is not allowed.");
            return 0;
        }

        int low = 0;
        int high = dividend;
        int answer = 0;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (mid * divisor <= dividend) {
                answer = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Dividend: ");
        int dividend = sc.nextInt();

        System.out.print("Enter Divisor: ");
        int divisor = sc.nextInt();

        if (dividend < 0 || divisor <= 0) {
            System.out.println("Enter positive numbers only.");
            return;
        }

        int quotient = divide(dividend, divisor);

        System.out.println("Quotient = " + quotient);
    }
}