 # JobSheet 8 Week (09)
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

----
#### 2.3 Experiment 3: Debugging a Star Triangle – Nested WHILE
The starting code in this experiment is intentionally written so that it does not yet produce
the correct triangle format. Your task is to identify the errors and fix them without changing
the WHILE structure into FOR.
Target output for n=5;

##### program:

``` java
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
    }
}

```
##### Output:
    Enter the value of n = 5

    *
    * *
    * * *
    * * * *
    * * * * *

##### Questions:

1. Identify the mismatches in the initial output, and at least two fixes needed to produce a
nested triangle pattern.
2. Explain the roles of the variables i and j. Why must the value of j be reset to 0 in every
iteration of the outer loop? What happens if j is not reset?
3. Explain the changes to the initialization, the condition, and the update of the outer loop
that are needed to form the inverted triangle.

##### Answers:
1. at the end there need the line break mean a println()  and the other one is to start the value of the i form 1 not from 0.

2. if i=row and j=count per row if we reset the j to 0 each row so counting restarts if not reset the rows print too few stars.

3. for the inverted tringle changes int i =n, condtiotion i>=1 update: i-- and the inner loop j<i and j++.

----

##### 2.4 Experiment 4: Case Study of Group Project Scores
In assessing a group project, each group receives scores from a number of graders. The
program receives the number of groups and the number of graders (the same for every
group), then calculates the average score of each group and determines the group with the
highest average. This case is solved with nested loops without storing all the scores: a WHILE
(outer) for the groups, a FOR (middle) for the graders, and a DO-WHILE (inner) to repeat
invalid score input.

##### Programm:
``` Java
import java.util.Scanner;
public class GroupScore {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter the number of the groupS: ");
        int numGroup = input.nextInt();
        System.out.print("Enter the Nnumber of grades: ");
        int numGrades = input.nextInt();

        if (numGroup <= 0 || numGrades <= 0){
            System.out.println("Invalid input. Please enter positive integers for the number of groups and grades.");
            return;
        }else{
            int groupNO = 1;
            double highestAverage = -1;
            int bestGroup = 0;

            while (groupNO <= numGroup){
                System.out.println("Group " + groupNO );
                double totalScore = 0;


                groupNO++;
                for (int i = 1; i <= numGrades; i++){
                    int score;
                    do {
                        System.out.print("Score form Grade " + i + ": ");
                        score = input.nextInt();
                        if (score < 0 || score > 100) {
                            System.out.println("Invalid score. Please enter a score between 0 and 100.");
                        }
                    } while (score < 0 || score > 100);
                    totalScore += score;
        }
        double averageScore = totalScore / numGrades;
        System.out.println("Group " + (groupNO -1) + " average score: " + averageScore);

        if (averageScore > highestAverage) {
            highestAverage = averageScore;
            bestGroup = groupNO;
        } 
       
            }
             System.out.println("================================");
        System.out.println("Best Group            : " +( bestGroup-1));
        System.out.println("Highest Average Score : " + highestAverage);
        } 

    }
}
```
##### Out put:
    Enter the number of the groupS: 3
    Enter the Nnumber of grades: 2
    Group 1
    Score form Grade 1: 80
    Score form Grade 2: 90
    Group 1 average score: 85.0
    Group 2
    Score form Grade 1: 75 
    Score form Grade 2: 890
    Invalid score. Please enter a score between 0 and 100.
    Score form Grade 2: 89
    Group 2 average score: 82.0
    Group 3
    Score form Grade 1: 59
    Score form Grade 2: 89
    Group 3 average score: 74.0
    ================================
    Best Group            : 1
    Highest Average Score : 85.0

##### Questaion:
1. Why must totalScore be reset inside the outer loop, but highestAverage must not
be reset for each group?
2. For 3 groups and 2 graders (without any invalid input), how many times is the body of the
FOR loop executed in total?
3. What happens if totalScore is declared as int and the average is calculated using
integer division? Give an example of values.
4. Why is highestAverage given the initial value -1 rather than 0? Give an example of
input that produces a wrong result if the initial value were 0.
5. This program has three levels of loops. Name each type of loop and its role
##### Ansers:

1. the condition of total score must start form 0 in evey group.and the highest must keept the avrage must be completed.

2. for the 3 and 2 time the loop will exicut up to 6 times.
3. then the friactionl part will lost and the programm will gives the error. useing the double can make it average to decimal part.

4. if we dont intinalize the higest score to zero then every group will recive the number of the zero and dont be update during the loop.

5.  while (process the groups data), For (Process for the grades in each group) and Do while (repates the invalide score).

----
##### 1. Assignment 1: Nested Number Pattern

Write a program that prints a number pattern from 1 up to the row number. Enter an integer
n (n is at least 1). The first row prints 1, the second row prints 1 2, and so on up to row n. After
the pattern is complete, display the total number of digits that have been printed. Save the
file with the name: Task1StudentNo.java.
For n = 5:
Enter the value of n = 5
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
Total numbers printed: 15


#### Program:
``` java
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
```

##### Out put:
    Enter the value of n = 5
    1 
    1 2 
    1 2 3 
    1 2 3 4 
    1 2 3 4 5 
    Total numbers to be printed: 15
----

##### 2. Assignment 2: Multiplication Table

Write a program that displays a multiplication table of size n × n using nested FOR or WHILE
loops. The value of n is at least 3. Each position displays the product of its row number and
column number. Arrange the spacing so that the output is neat, then display the sum of all
the numbers in the table. Save the program with the file name: Task2StudentNo.java.
For n = 4:
Enter the value of n = 4
 1 2 3 4
 2 4 6 8
 3 6 9 12
 4 8 12 16
Total of all numbers: 100
Hint: to align the numbers to the right, use System.out.printf("%4d", result);, which prints
a number with a width of 4 characters, or use the tab character "\t" as a separator.

##### Program:
``` java
import java.util.Scanner;
public class Task2_24 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n = ");
        int n = input.nextInt();
        int total =0;
        for (int i=1 ; i <=n ; i++){
            for (int j=1 ; j<=n ; j++){
                int result = i * j;
                System.out.printf("%4d", result);
                total += result;
            }
            System.out.println();
        }
        System.out.println("Total of all numbers: " + total);
        input.close();
    }
}
```
##### out put:
    Enter the value of n = 4
     1   2   3   4
     2   4   6   8
     3   6   9  12
     4   8  12  16
    Total of all numbers: 100

##### 3. Assignment 3: Sales Recap for Several Stores

A shopping center has several stores. Each store serves a number of customers on the same
day, and each customer buys several items. The program asks for the number of stores, then
the number of customers at each store, and the number of items bought by each customer.
Calculate and display the total number of customers and the total number of items for each
store, the total number of items across all stores, and the number of the store with the most
items. If several stores share the highest value, display the store with the smallest number.
Save the program with the file name: Task3StudentNo.java.
Requirements: the number of stores is at least 1. The number of customers and the number
of items per customer may be 0, but must not be negative. Use nested loops. The data does
not need to be stored one by one; it is sufficient to accumulate it into the total variables.
Example: Store 1 has 2 customers who bought 3 and 2 items; Store 2 has 3 customers who
bought 1, 4, and 2 items. The expected summary is:
Store 1 - customers: 2, total items: 5
Store 2 - customers: 3, total items: 7
Total items across all stores: 12
Store with the most items: 2

##### Program:
``` java
import java.util.Scanner;
public class Task3_24 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numStores;
        do{
            System.out.print("Enter the number of Stores: ");
            numStores = input.nextInt();
            if (numStores < 0){
                System.out.println("Number of the Stores must be at least 1. Please try again.");
            }
        } while (numStores < 1);
        int totalItemsallStores = 0;
        int mostItemsStore = 0;
        int bestStore = 0;
        for (int i = 1; i < numStores; i++){
            int numCustomers;
            do{ System.out.print("Enter the number of Customers for Store " + i + ": ");
            numCustomers = input.nextInt();
            if (numCustomers < 0){
                System.out.println("Number of Customers must be a positive integer. Please try again.");
            }
        } while (numCustomers < 0);
        int totalItemsStore = 0;
        for (int j = 1; j <= numCustomers; j++){
            int numItems;
            do{
                System.out.print("Enter the number of Items for Customer " + j + ": ");
                numItems = input.nextInt();
                if (numItems < 0){
                    System.out.println("Number of Items must be a positive integer. Please try again.");
                }
            } while (numItems < 0);
            totalItemsStore += numItems;
        } System.out.println("Store " + i + " - Customer " + numCustomers + " Total Items: " + totalItemsStore);
        totalItemsallStores += totalItemsStore;
        if (totalItemsStore > mostItemsStore){
            mostItemsStore = totalItemsStore;
            bestStore = i;

        }
        System.out.println("Total items across all stores: " + totalItemsallStores);
        System.out.println("Store with the best itesms: " + bestStore);
    }
    input.close();
}
}
```
##### Out pu:
    Enter the number of Stores: 4
    Enter the number of Customers for Store 1: 5
    Enter the number of Items for Customer 1: 1
    Enter the number of Items for Customer 2: 2
    Enter the number of Items for Customer 3: 3
    Enter the number of Items for Customer 4: 4
    Enter the number of Items for Customer 5: 5
        Store 1 - Customer 5 Total Items: 15
        Total items across all stores: 15
        Store with the best itesms: 1
    Enter the number of Customers for Store 2: 4
    Enter the number of Items for Customer 1: 1
    Enter the number of Items for Customer 2: 2
    Enter the number of Items for Customer 3: 3
    Enter the number of Items for Customer 4: 4
        Store 2 - Customer 4 Total Items: 10
        Total items across all stores: 25
        Store with the best itesms: 1
    Enter the number of Customers for Store 3: 3
    Enter the number of Items for Customer 1: 66
    Enter the number of Items for Customer 2: 7
    Enter the number of Items for Customer 3: 5
        Store 3 - Customer 3 Total Items: 78
        Total items across all stores: 103
        Store with the best itesms: 3

----






