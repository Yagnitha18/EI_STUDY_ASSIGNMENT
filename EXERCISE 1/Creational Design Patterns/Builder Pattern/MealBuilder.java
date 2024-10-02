public class MealBuilder {
    private Meal meal;

    public MealBuilder() {
        this.meal = new Meal();
    }

    public MealBuilder setDrink(String drink) {
        meal.setDrink(drink);
        return this;
    }

    public MealBuilder setMainCourse(String mainCourse) {
        meal.setMainCourse(mainCourse);
        return this;
    }

    public MealBuilder setSide(String side) {
        meal.setSide(side);
        return this;
    }

    public Meal build() {
        return this.meal;
    }
}
