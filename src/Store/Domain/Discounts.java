package Store.Domain;

public enum Discounts {
    NONE(0), SUPER(5), SUPER2(10), SUPER3(15);

    private final int percentage;

    Discounts(int percentage) {
        this.percentage = percentage;
    }

    public int getPercentage() {
        return percentage;
    }
}
