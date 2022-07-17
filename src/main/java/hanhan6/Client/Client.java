package hanhan6.Client;

import hanhan6.Entity.KFCWaiter;
import hanhan6.Entity.Meal;
import hanhan6.Entity.MealBuilder;
import hanhan6.Util.XMLUtil;

/**
 * @Author hanhan
 * @Date 2022/3/15 8:11
 */

public class Client {
    public static void main(String args[]) {
        //动态确定套餐种类
        MealBuilder mb = (MealBuilder) XMLUtil.getBean();
        //服务员是指挥者
        KFCWaiter waiter = new KFCWaiter();
        //服务员准备套餐
        waiter.setMealBuilder(mb);
        //客户获得套餐
        Meal meal = waiter.construct();

        System.out.println("套餐组成：");
        System.out.println(meal.getFood());
        System.out.println(meal.getDrink());
    }
}
