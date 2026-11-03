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
