import java.util.Random;
import java.util.Scanner;

public class ItemUpgrade {

    // Method to calculate number of level 1 items needed to create an item of level n
    public static int calculateItems(int level) {
        if (level == 1) {
            return 1;
        }
        return 2 * calculateItems(level - 1);
    }

    // Method to calculate the total cost to upgrade to a given level
    public static long calculateTotalCost(int level) {
        long totalCost = 0;
        long initialCost = 10000000;
        long increment = 1000000;

        for (int i = 2; i <= level; i++) {
            totalCost += initialCost + (i - 2) * increment;
        }

        return totalCost;
    }

    // Method to simulate the upgrade process with the element of surprise
    public static int simulateUpgrade(int targetLevel, boolean useOptionalItem) {
        Random random = new Random();
        int currentLevel = 1;
        int itemsNeeded = 0;

        while (currentLevel < targetLevel) {
            if (currentLevel < 6) {
                currentLevel++;
            } else {
                double successChance = Math.max(0.30, 0.60 - 0.05 * (currentLevel - 6));
                if (random.nextDouble() <= successChance) {
                    currentLevel++;
                } else {
                    if (useOptionalItem) {
                        currentLevel--;
                        targetLevel--;
                    } else {
                        currentLevel--;
                    }
                }
            }
            itemsNeeded++;
        }

        return itemsNeeded;
    }

    // Method to estimate the chance of successfully upgrading beyond level 6 without using the optional item
    public static double estimateSuccessChance(int targetLevel) {
        int simulations = 100000;
        int successfulAttempts = 0;

        for (int i = 0; i < simulations; i++) {
            if (simulateUpgrade(targetLevel, false) >= targetLevel) {
                successfulAttempts++;
            }
        }

        return (double) successfulAttempts / simulations * 100;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter target level: ");
        int targetLevel = scanner.nextInt();

        System.out.print("Use optional item to prevent losing material item? (true/false): ");
        boolean useOptionalItem = scanner.nextBoolean();

        int itemsNeeded = calculateItems(targetLevel);
        long totalCost = calculateTotalCost(targetLevel);
        int totalItemsNeeded = simulateUpgrade(targetLevel, useOptionalItem);
        double successChance = estimateSuccessChance(targetLevel);

        System.out.println("Number of level 1 items needed to create an item of level " + targetLevel + ": " + itemsNeeded);
        System.out.println("Total cost to upgrade to level " + targetLevel + ": " + totalCost + " units");
        System.out.println("Total number of items needed with surprise element to reach level " + targetLevel + ": " + totalItemsNeeded);
        System.out.println("Optional item used: " + useOptionalItem);
        if (targetLevel > 6 && !useOptionalItem) {
            System.out.println("Estimated chance of successfully upgrading to level " + targetLevel + " without using optional item: " + successChance + "%");
        }

    }
}
