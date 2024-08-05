package Store.Test;

import Store.Domain.StoreProduct;
import Store.Domain.Discounts; // Importe o enum Discounts
import Store.Service.Discount;

public class StoreTest01 {
    public static void main(String[] args) {
        StoreProduct storeProduct = new StoreProduct("Loja do João", "Roupas");
        storeProduct.setDiscounts(Discounts.SUPER);
        storeProduct.getPriceRandomic();
        Discount.applyDiscount(storeProduct);
    }
}
