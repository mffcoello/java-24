import java.util.Scanner;

public class SlotMachineGame {
    public static void main(String[] args) {
        SlotMachine slotMachine = new SlotMachine();
        Scanner keyboard = new Scanner(System.in);

        double totalBet = 0;
        double totalWon = 0;

        do {
            System.out.println("Welcome to the Mayf Slot Machine Game!");

            System.out.print("\nEnter the amount you would like to bet: $");
            double amountBet = keyboard.nextDouble();

            totalBet += amountBet;

            String outcome = slotMachine.spin();
            System.out.println();

            double amountWon = slotMachine.calculateWinnings(outcome, amountBet);
            System.out.printf("\nYou win $%,.2f\n", amountWon);

            totalWon += amountWon;

            System.out.println("\nWould you like to play again?");
            System.out.print("Enter Y for yes or N for no: ");
            String input = keyboard.next();
            char playAgain = input.charAt(0);

            if (playAgain != 'Y' && playAgain != 'y') {
                break;
            }
        } while (true);

        System.out.printf("You bet a total of $%,.2f\n", totalBet);
        System.out.printf("You won a total of $%,.2f\n", totalWon);
    }
}