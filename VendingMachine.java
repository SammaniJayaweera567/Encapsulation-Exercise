package encapsulationassignment;

public class VendingMachine {

    private int drinkCount = 10;
    private int foodCount = 5;
    private int chocolateCount = 5;

    public int getDrinkCount() {
        return drinkCount;
    }

    public void setDrinkCount(int drinkCount) {
        this.drinkCount = drinkCount;
    }

    public int getFoodCount() {
        return foodCount;
    }

    public void setFoodCount(int foodCount) {
        this.foodCount = foodCount;
    }

    public int getChocolateCount() {
        return chocolateCount;
    }

    public void setChocolateCount(int chocolateCount) {
        this.chocolateCount = chocolateCount;
    }


}

