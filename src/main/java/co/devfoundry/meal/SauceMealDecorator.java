package co.devfoundry.meal;

public class SauceMealDecorator extends MealDecorator{
    public SauceMealDecorator(Meal decoratorMeal) {
        super(decoratorMeal);
    }

    public void prepareMeal() {
        meal.prepareMeal();
        addSouce();
    }

    private void addSouce() {
        System.out.println("I'm adding souce to a meal.");
    }
}
