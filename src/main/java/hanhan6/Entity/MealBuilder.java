package hanhan6.Entity;

/**
 * @Author hanhan
 * @Date 2022/3/15 8:12
 */

public abstract class MealBuilder {
    protected Meal meal = new Meal();

    public abstract void buildFood();

    public abstract void buildDrink();

    public Meal getMeal() {
        return meal;
    }
}
