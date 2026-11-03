 # JobSheet 7 Week (08)
 ## Name: Muhammad Talha
 ## NIM : 264107020089
 ## CLass: TI-1I

 ---
 ### Objectives
• Understand the concept of nested loops in algorithms
• Understand the flow of nested loops
• Recognize the syntax of nested loops
• Be able to apply nested loops to solve a simple case study.

---

#### 2.1 Experiment 1: Review of Loops 1
This experiment revisits the FOR loop before learning nested loops. The program prints the
character * n times horizontally (side by side). Use n as a positive integer input.

##### Program 
``` Java 
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
        for(int i = 2 ; i <=n ; i+=2){
            System.out.print(i+" ");
        }
        System.out.println();

    }
    
}
```
#### Output:
    Enter the value of rows = 3
    Enter the value of colums = 6
    ******
    ******
    ******

###### Questions:
1. If the initialization i = 1 is changed to i = 0 without changing the condition, how many
* characters are printed when n = 5? Explain.
2. If the condition i <= n is changed to i < n, how many times does the loop run when
n = 5? Why is the result different?
3. Predict the output of the following code fragment when n = 9, then verify it by replacing
the FOR loop in your program and running it.
for (int i = 2; i <= n; i += 2) {
 System.out.print(i + " ");
}
Modify this code so that it prints the odd positive numbers that do not exceed n.
4. Explain why changing the increment i++ to i-- (with the condition still i <= n) makes
the loop run endlessly, so that it does not stop in a reasonable time for positive n. Do not
run that version; if it has already started running, stop the program by pressing Ctrl + C
in the terminal.

###### Answers
1. changing the i=1  condition to 1=0 then if n=5 then it will print the total=6 character becuse the the count start from the 0, if we start from the 1 to 5 then it will be 5 other wise from 0 will be 6 count.

2. if the condition(i=1;i<n;i++) it will run 4 charactur. the diffrene is if the is less or equal the the condation will gothrough upto it other wise end the for loop.

3. modified code is for i=2 and i<=n and n=9

        
4. if the UPdate is i++; change to i-- and the condition is still i<=n; then it will alwas true so that's why the infinte loop will run.

----
##### 2.2 Experiment 2: Rectangle Star Pattern (Nested FOR)
In this experiment a nested loop of FOR statements is used to print a rectangle of stars. The
number of rows and columns is entered separately, so the role of each loop can be observed
clearly: the outer loop controls the rows, while the inner loop controls the columns (recall the
shelf/locker analogy from the lecture material).
For the input rows = 3 and columns = 6, the output is:
    ******
    ******
    ******

##### Program:
``` java
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
        input.close();
  
    }
    
}
```
##### Output
    Enter the value of rows = 3
    Enter the value of colums = 6
    ######
    ######
    ######
##### Question:

1. Explain the function of the variables i and j in the program.
2. How many times are the outer loop, the inner loop, and the statement print("*")
executed for rows = 4 and columns = 7?
3. What happens if the bounds of the outer and inner loops are swapped (the outer loop
uses columns and the inner loop uses rows)? Use rows = 3 and columns = 6 to explain.
4. Explain the effect of removing System.out.println(); after the inner loo
##### Answes:

1. funcation of i and j in the program is to print inner for loop and outer for loop.
        
2. if we give the number of rows=4 and colums=7 the stament print("*") will be total 28.

3. outer and inner loop swapped to the ounter loop uses colums and inner loop uses rows if rows =3 adn coulums=6 then the total print will be 18 because the outer loop will run 6 times and inner loop will run 3 times.

4. if we remove the println() after the inner loop then the output will be in one line because the println() is used to print in new line.






