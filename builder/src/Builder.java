import builder.Meal;
import builder.MealBuilder;

public class Builder {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.show();
        System.out.println("Total Cost: " + vegMeal.totalCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.show();
        System.out.println("Total Cost: " + nonVegMeal.totalCost());
    }
}
