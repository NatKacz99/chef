package co.devfoundry.meal;

public class ShrimpMealDecorator extends MealDecorator{
    public ShrimpMealDecorator(Meal decoraterMeal) {
        super(decoraterMeal);
    }

    @Override
    public void prepareMeal() {
        meal.prepareMeal();
        addShrimp();
    }

    private void addShrimp() {
        System.out.println("I'm adding shrimp to a meal.");
    }
}
