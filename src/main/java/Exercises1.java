import java.util.Scanner;

public class Exercises1
{
    /*
    function that returns factorial of given n
    */

    public static long factorial(int n) {
        long answer = 1; //sets the default answer to 1
        for (int i = 1; i <= n; i++) {
            answer = answer * i; //multiplies the answer from 1 to n
        }
        return answer;
    }


    /*
    function that return nth number of fibonacci series
    the series -> 1, 1, 2, 3, 5, 8, ...
    */

    public static long fibonacci(int n) {
        long fib;
        if (n == 1 || n == 2) { //returns 1 for the first and the second object of the sequence
            return 1;
        }
        else {
            fib = fibonacci(n - 1) + fibonacci(n - 2); //each number is the sum of two preceding ones
        }
        return fib;
    }

    /*
    function that returns a triangle with n rows and columns:
    */

    public static char[][] generateTriangle(int rows) {
        char[][] triangle = new char[rows][]; //creates an array which rows are defined but columns are left to be defined later
        for (int i = 0; i < rows; i++) {
            triangle[i] = new char[i + 1]; //defines the columns for every row depending on the row it is on
            for (int j = 0; j <= i; j++) {
                triangle[i][j] = '*';
            }
        }
        return triangle;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //testing factorial function
        int n = input.nextInt();
        long fact = factorial(n);
        System.out.println(fact);

        //testing fibonacci function
        int m = input.nextInt();
        long fibo = fibonacci(m);
        System.out.println(fibo);

        //testing generateTriangle function
        int r = input.nextInt();
        char[][] triangle = new char[r][r];
        triangle = generateTriangle(r);
        for (int i = 0; i < r; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(triangle[i][j]);
            }
            System.out.println();
        }
    }

}
