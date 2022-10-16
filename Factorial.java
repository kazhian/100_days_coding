import java.util.Scanner;
import java.util.stream.Stream;

public class Factorial {
   public static void main(String p[]) {
    Scanner scanner = new Scanner(System.in) ;
    System.out.print("Enter a number:");
    int n = scanner.nextInt();
    scanner.close();

    System.out.printf("Factorial of %d is %d\n", n, factorial(n)); 
   }
   
   public static Integer factorial(Integer i) {
    if (i == 0 || i == 1)
        return 1;

    return i * factorial(i - 1);
   }
}
