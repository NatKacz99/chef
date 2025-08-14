package co.devfoundry.meal;

public class ChickenMealDecorator extends MealDecorator{
    public ChickenMealDecorator(Meal decoraterMeal) {
        super(decoraterMeal);
    }

    @Override
    public void prepareMeal() {
        meal.prepareMeal();
        addChicken();
    }

    private void addChicken() {
        System.out.println("I'm adding chicken to a meal.");
    }
}
