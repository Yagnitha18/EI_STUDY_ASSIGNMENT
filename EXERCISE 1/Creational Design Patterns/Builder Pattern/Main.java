public class Main {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal meal1 = mealBuilder.setDrink("Coke")
                                .setMainCourse("Burger")
                                .setSide("Fries")
                                .build();

        Meal meal2 = mealBuilder.setDrink("Pepsi")
                                .setMainCourse("Pizza")
                                .setSide("Garlic Bread")
                                .build();

        System.out.println("Meal 1: " + meal1);
        System.out.println("Meal 2: " + meal2);
    }
}
