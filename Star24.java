import java.util.Scanner;
public class Star24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n = ");
        int n = input.nextInt();
        for (int i=1; i<n; i++){
            System.out.print("*");
            
        }
        System.out.println();
        input.close();

        // 1. changing the i=1  condition to 1=0 then if n=5 then it will print the total=6 character becuse the the count start from the 0, if we start from the 1 to 5 then it will be 5 other wise from 0 will be 6 count.

        //2. if the condition(i=1;i<n;i++) it will run 4 charactur. the diffrene is if the is less or equal the the condation will gothrough upto it other wise end the for loop.

        // 3. modified code is for i=2 and i<=n and n=9

        
        //4. if the UPdate is i++; change to i-- and the condition is still i<=n; then it will alwas true so that's why the infinte loop will run.

        for(int i = 2 ; i <=n ; i+=2){
            System.out.print(i+" ");

        }
        System.out.println();

    }
    
}
