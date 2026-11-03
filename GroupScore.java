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


