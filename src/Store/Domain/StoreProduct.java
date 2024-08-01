package Store.Domain;

import java.util.concurrent.ThreadLocalRandom;

public class StoreProduct {
    private String name;
    private String description;
    private int price;
    private Discounts discounts;

    public StoreProduct(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public int getPriceRandomic() {
        int i = ThreadLocalRandom.current().nextInt(1, 500);
        price = i;
        return price;
    }

    // Getters e setters
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Discounts getDiscounts() {
        return discounts;
    }

    public void setDiscounts(Discounts discounts) {
        this.discounts = discounts;
    }
}
