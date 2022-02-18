import java.util.Scanner;

                                //----------------------Menu Driven Program-------------------//

/*
WAP to find how many number are perfect square in given range.
for ex:-
Sample input:
3 9      range is 3 to 9 inclusive.
output:
2
Explanation:
because 4 and 9 is perfect square in range 3 to 9
 */

public class PerfectSquare_In_Range {
    //-------------logic implementation
    public static void perfectsqaue()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Starting Number of range:");
        int start = sc.nextInt();
        System.out.println("Enter the end Number of the range:");
        int end = sc.nextInt();
        System.out.println("Number of perfect square in the given range:");
        int c = 0;
        for (int i=0; i<=end; i++)
        {
            if(i*i<=end && i*i>=start)
            {
                c++;
            }
        }
        System.out.println(c);
    }

    //--------------------main method
    public static void main(String[] args) {

        while(true)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("For calculating the count of the perfect square in the given range.");
            System.out.println("Enter: 1");
            System.out.println("For end the program/code \nEnter: 2");
            int n = sc.nextInt();
            switch (n)
            {
                case 1:
                    perfectsqaue();
                    break;
                case 2:
                    System.exit(2);
                    break;
                default:
                    System.out.println("Enter the correct Number.");
            }
        }

    }
}
