import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int counter = 1;
        int total = 0;

        while (true){

            System.out.println("Enter your number " + counter + ":");
            boolean isAnInt = scanner.hasNextInt();
            if(isAnInt){
                int chosenNumber = scanner.nextInt();
                total += chosenNumber;
                counter += 1;
                if(counter == 10){
                    break;
                }
            } else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
        }
        scanner.close();
        System.out.println("The total amount is " + total);
    }
}
