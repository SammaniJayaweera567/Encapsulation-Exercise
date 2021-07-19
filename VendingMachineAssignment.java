package encapsulationassignment;

import java.util.*;

public class VendingMachineAssignment {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Integer maxDrinkCount = 10;
        Integer maxFoodCount = 5;
        Integer maxChocolateCount = 5;

        VendingMachine vendingMachine = new VendingMachine();

        while(true){
            System.out.println("-------------------------------------------");
            System.out.println("Welcomt to Vending Machine System");
            System.out.println("-------------------------------------------");
            System.out.println("Press A to Buy Item from Vending Machine");
            System.out.println("Press B to Store Item to Vending Machine");
            System.out.println("Press C to Exit from Vending Machine");

            String scannerInput = scanner.next();
            if(scannerInput.toUpperCase().equalsIgnoreCase("A")){
                System.out.println("-------------------------------------------");
                System.out.println("Press 1 to Buy Drinks");
                System.out.println("Press 2 to Buy Food");
                System.out.println("Press 3 to Buy Chocolate");
                Integer stockItem = scanner.nextInt();

                //Drinks
                if(stockItem == 1){
                    System.out.println("-------------------------------------------");
                    System.out.println("Vending machine have "+ vendingMachine.getDrinkCount()+ " drinks.");
                    System.out.println("How many bottles you want ? ");
                    Integer bottleCount = scanner.nextInt();
                    if((vendingMachine.getDrinkCount() == 0) || (bottleCount > vendingMachine.getDrinkCount())){
                        System.out.println("-------------------------------------------");
                        System.out.println("Sorry, You can't buy "+bottleCount+ " bottles. You can buy " + vendingMachine.getDrinkCount());
                        System.out.println("-------------------------------------------");
                    }else{
                        System.out.println("-------------------------------------------");
                        vendingMachine.setDrinkCount(vendingMachine.getDrinkCount() - bottleCount);
                        System.out.println("Thank You for buying "+ bottleCount+ " drinks.");
                        System.out.println("-------------------------------------------");
                        bottleCount = 0;
                    }
                }
                //Food
                else if(stockItem == 2){
                    System.out.println("-------------------------------------------");
                    System.out.println("Vending machine have "+ vendingMachine.getFoodCount()+ " food packs.");
                    System.out.println("How many food packs you want ? ");
                    Integer foodCount = scanner.nextInt();
                    if((vendingMachine.getFoodCount() == 0) || (foodCount > vendingMachine.getFoodCount())){
                        System.out.println("-------------------------------------------");
                        System.out.println("Sorry, You can't buy "+foodCount+ " food packs. You can buy " + vendingMachine.getFoodCount());
                        System.out.println("-------------------------------------------");
                    }else{
                        System.out.println("-------------------------------------------");
                        vendingMachine.setFoodCount(vendingMachine.getFoodCount() - foodCount);
                        System.out.println("Thank You for buying "+ foodCount+ " food packs.");
                        System.out.println("-------------------------------------------");
                        foodCount = 0;
                    }
                }
                //Chocolate
                else if(stockItem == 3){
                    System.out.println("-------------------------------------------");
                    System.out.println("Vending machine have "+ vendingMachine.getChocolateCount()+ " chocolates.");
                    System.out.println("How many chocolates you want ? ");
                    Integer chocolateCount = scanner.nextInt();
                    if((vendingMachine.getChocolateCount() == 0) || (chocolateCount > vendingMachine.getChocolateCount())){
                        System.out.println("-------------------------------------------");
                        System.out.println("Sorry, You can't buy "+chocolateCount+ " chocolates. You can buy " + vendingMachine.getChocolateCount());
                        System.out.println("-------------------------------------------");
                    }else{
                        System.out.println("-------------------------------------------");
                        vendingMachine.setChocolateCount(vendingMachine.getChocolateCount() - chocolateCount);
                        System.out.println("Thank You for buying "+ chocolateCount+ " chocolates.");
                        System.out.println("-------------------------------------------");
                        chocolateCount = 0;
                    }
                }
                System.out.println("-------------------------------------------");
                continue;
            }else if(scannerInput.toUpperCase().equalsIgnoreCase("B")){
                System.out.println("");
                System.out.println("Press 1 to Store Drinks");
                System.out.println("Press 2 to Store Food");
                System.out.println("Press 3 to Store Chocolate");
                Integer stockItem = scanner.nextInt();

                //Drinks
                if(stockItem == 1){
                    System.out.println("-------------------------------------------");
                    System.out.println("Vending machine have "+ vendingMachine.getDrinkCount()+ " drinks. You can store upto "+ maxDrinkCount + " drinks.");
                    System.out.println("How many bottles you want to store ? ");
                    Integer bottleCount = scanner.nextInt();
                    if((vendingMachine.getDrinkCount() == maxDrinkCount) || (bottleCount > maxDrinkCount)){
                        System.out.println("-------------------------------------------");
                        System.out.println("Sorry, You can't store "+bottleCount+ " bottles. You can store " + (maxDrinkCount - vendingMachine.getDrinkCount()) + " bottles." );
                        System.out.println("-------------------------------------------");
                    }else{
                        System.out.println("-------------------------------------------");
                        vendingMachine.setDrinkCount(vendingMachine.getDrinkCount() + bottleCount);
                        System.out.println("Thank You for storing "+ bottleCount+ " bottles.");
                        System.out.println("-------------------------------------------");
                        bottleCount = 0;
                    }
                }
                //Foods
                else if(stockItem == 2){
                    System.out.println("-------------------------------------------");
                    System.out.println("Vending machine have "+ vendingMachine.getFoodCount()+ " food packs. You can store upto "+ maxFoodCount + " food packs.");
                    System.out.println("How many food packs you want to store ? ");
                    Integer foodCount = scanner.nextInt();
                    if((vendingMachine.getFoodCount() == maxFoodCount) || (foodCount > maxFoodCount)){
                        System.out.println("-------------------------------------------");
                        System.out.println("Sorry, You can't store "+foodCount+ " food packs. You can store " + (maxFoodCount - vendingMachine.getFoodCount()) + " food packs." );
                        System.out.println("-------------------------------------------");
                    }else{
                        System.out.println("-------------------------------------------");
                        vendingMachine.setFoodCount(vendingMachine.getFoodCount() + foodCount);
                        System.out.println("Thank You for storing "+ foodCount+ " food packs.");
                        System.out.println("-------------------------------------------");
                        foodCount = 0;
                    }
                }
                //Chocolate
                if(stockItem == 3){
                    System.out.println("-------------------------------------------");
                    System.out.println("Vending machine have "+ vendingMachine.getChocolateCount()+ " chocolates. You can store upto "+ maxChocolateCount + " chocolates.");
                    System.out.println("How many chocolates you want to store ? ");
                    Integer chocolateCount = scanner.nextInt();
                    if((vendingMachine.getChocolateCount() == maxChocolateCount) || (chocolateCount > maxChocolateCount)){
                        System.out.println("-------------------------------------------");
                        System.out.println("Sorry, You can't store "+chocolateCount+ " chocolates. You can store " + (maxChocolateCount - vendingMachine.getChocolateCount()) + " chocolates." );
                        System.out.println("-------------------------------------------");
                    }else{
                        System.out.println("-------------------------------------------");
                        vendingMachine.setChocolateCount(vendingMachine.getChocolateCount() + chocolateCount);
                        System.out.println("Thank You for storing "+ chocolateCount+ " chocolates.");
                        System.out.println("-------------------------------------------");
                        chocolateCount = 0;
                    }
                }
                System.out.println("-------------------------------------------");
                continue;
            }else if(scannerInput.toUpperCase().equalsIgnoreCase("C")){
                System.out.println("-------------------------------------------");
                System.out.println("Thank You for using Vending Machine System.");
                System.out.println("-------------------------------------------");
            }
        }
    }
}
