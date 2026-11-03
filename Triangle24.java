import java.util.Scanner;
public class Triangle24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n = ");
        int n = input.nextInt();
        int i = 0;
        while( i<=n){ // (i <= 1) for the condition will be false because the i is greater than 1 so the loop will not run. if we change the condition to (i <= n) then it will run infinite time because the i is always less than or equal to n.
            int j=0;
            while (j<i){
                System.out.print(" *");
                j++;    
            }
            System.out.println();
            i++; // if we change the to i++ then the loop will run oposit of it while we change the condition to (i<=n)
        }
        input.close();

        //1. at the end there need the line break mean a println()  and the other one is to start the value of the i form 1 not from 0.

        //2.if i=row and j=count per row if we reset the j to 0 each row so counting restarts if not reset the rows print too few stars.

        //3. for the inverted tringle changes int i =n, condtiotion i>=1 update: i-- and the inner loop j<i and j++.
    }
}