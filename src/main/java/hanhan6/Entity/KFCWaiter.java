package hanhan6.Entity;

/**
 * @Author hanhan
 * @Date 2022/3/15 8:12
 */

public class KFCWaiter {
    private MealBuilder mb;

    public void setMealBuilder(MealBuilder mb) {
        this.mb = mb;
    }

    public Meal construct() {
        mb.buildFood();
        mb.buildDrink();
        return mb.getMeal();
    }
}