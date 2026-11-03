import java.util.Scanner;
public class Task1_24 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n = ");
        int n = input.nextInt();
        // for the total number printed 
        for (int i=1 ; i <=n ; i++){
            int j;
            for (j=1 ; j<=i ; j++){
                System.out.print(j +" ");
            }
            System.out.println();
        }
        int totalNumbers = (n * (n + 1)) / 2;
        System.out.println("Total numbers to be printed: " + totalNumbers);








    }
}
