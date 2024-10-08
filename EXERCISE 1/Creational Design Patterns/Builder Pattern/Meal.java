public class Meal {
    private String drink;
    private String mainCourse;
    private String side;

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public void setMainCourse(String mainCourse) {
        this.mainCourse = mainCourse;
    }

    public void setSide(String side) {
        this.side = side;
    }

    @Override
    public String toString() {
        return "Meal [Drink: " + drink + ", Main Course: " + mainCourse + ", Side: " + side + "]";
    }
}
