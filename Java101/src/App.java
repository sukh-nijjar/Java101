import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers will you enter?");
        Integer counter = scanner.nextInt();

        double totalSum = 0;
        double meanAvg = 0;

        for(int i = 0; i < counter; i++){
            System.out.println("Enter number " + (i+1) + ": ");
            Integer numberEntered = scanner.nextInt();
            totalSum += numberEntered;  
        }
        meanAvg = totalSum/counter;
        System.out.println("SUM OF " + counter + " NUMBERS IS " + totalSum + " WITH AN AVERAGE OF " + meanAvg);
        scanner.close();
    }
}
