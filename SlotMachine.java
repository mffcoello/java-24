import java.util.Random;

/**
 * This class represents a Slot Machine.
 */
public class SlotMachine {
    private static final int MAX_NUMBER = 5;
    private Random rand;

    public SlotMachine() {
        this.rand = new Random();
    }

    public String spin() {
        StringBuilder outcome = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            int randNum = rand.nextInt(MAX_NUMBER);
            outcome.append(randNum);
            switch (randNum) {
                case 0:
                    System.out.print("- Blueberries -");
                    break;
                case 1:
                    System.out.print("- Cherries -");
                    break;
                case 2:
                    System.out.print("- Bananas -");
                    break;
                case 3:
                    System.out.print("- Oranges -");
                    break;
                case 4:
                    System.out.print("- Melons -");
                    break;
                case 5:
                    System.out.print("- Coffee -");
                    break;
            }
        }
        return outcome.toString();
    }

    public double calculateWinnings(String outcome, double bet) {
        char rand1 = outcome.charAt(0);
        char rand2 = outcome.charAt(1);
        char rand3 = outcome.charAt(2);

        if (rand1 == rand2 && rand1 == rand3) {
            System.out.println("\nWow! All three match!");
            System.out.println("That triples your bet!");
            return bet * 3;
        } else if (rand1 == rand2 || rand1 == rand3 || rand2 == rand3) {
            System.out.println("\nGreat! Two match.");
            System.out.println("That doubles your bet!");
            return bet * 2;
        } else {
            System.out.println("\nSorry, None match...");
            return 0;
        }
    }
}