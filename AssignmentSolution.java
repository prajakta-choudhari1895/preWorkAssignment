import java.util.Scanner;

public class AssignmentSolution {
    int num, r,sum=0;
    Scanner sc = new Scanner(System.in);

    public void palindromeNumber() {
        System.out.println("Please enter the number to check palindrome: ");
        num = sc.nextInt();
        int temp = num;
        while(num>0){
            r=num%10;
            sum=(sum*10)+r;
            num=num/10;
        }
        if (temp == sum)
            System.out.println("The number entered is a palindrome");
        else
            System.out.println("Number is not a palindrome");
    }

    public void revPyramid() {
        System.out.println("Please enter number of stars: ");
        int star = sc.nextInt();
        for (int i = star; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void primeNumber() {
        System.out.println("Enter the number to check prime or composite: ");
        int prime = sc.nextInt();
        int temp = 0;
        for (int i = 2; i < prime; i++) {
            if (prime % i == 0) {
                temp++;
            }
        }
        if (temp > 0) {
            System.out.println("Number is composite!");
        } else
            System.out.println("Number is prime!");
    }

    public void fibonacciSeries() {
        System.out.println("Enter the number of elements to be printed in fibonacci series: ");
        int fib = sc.nextInt();
        int first = 0, second = 1;
        for (int i = 1; i <= fib; ++i) {
            int temp = first + second;
            System.out.print(temp + " ");
            first = second;
            second = temp;
        }
    }

    public static void main(String[] args) {
        AssignmentSolution as = new AssignmentSolution();
        Scanner sc = new Scanner(System.in);
        System.out.println("Select from the below options: \n"+"1. Palindrome Number\n" +"2. Reverse pyramid of stars \n"+"3. Prime Number\n" + "4. Fibonacci Series\n");
        int selection = sc.nextInt();
        switch (selection) {
            case 1:
                as.palindromeNumber();
                break;
            case 2:
                as.revPyramid();
                break;
            case 3:
                as.primeNumber();
                break;
            case 4:
                as.fibonacciSeries();
                break;
            default:
                System.out.println("Wrong selection!!");


        }
    }
}
