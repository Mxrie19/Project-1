import java.util.Scanner;

public class Marie {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int number = 1;
    int sum = 0;
    int count = 0;

    while (number != 0 || count <= 10) {
      System.out.println("Please enter your number: ");
      number = scan.nextInt();

      if (number != 0) {
        sum += number;
        count++;
      }
    }
    System.out.println("The sum of the numbers is " + sum);
  }
}
 

