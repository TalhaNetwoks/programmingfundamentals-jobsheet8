import  java.util.Scanner;
public class Rectangle24 {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of rows = ");
        int row = input.nextInt();
        System.out.print("Enter the value of colums = ");
        int colums = input.nextInt();

        for (int i=1; i <=row ; i++){
            for (int j=1 ; j<=colums; j++){
            System.out.print("#");
            } System.out.println("");
            continue;
        }

        //1.funcation of i and j in the program is to print inner for loop and outer for loop.
        
        //2. if we give the number of rows=4 and colums=7 the stament print("*") will be total 28.

        //outer and inner loop swapped to the ounter loop uses colums and inner loop uses rows if rows =3 adn coulums=6 then the total print will be 18 because the outer loop will run 6 times and inner loop will run 3 times.

        // if we remove the println() after the inner loop then the output will be in one line because the println() is used to print in new line.

        input.close();
  
    }
    
}
