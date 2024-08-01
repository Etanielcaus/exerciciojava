package Store.Service;

import Store.Domain.StoreProduct;

public class Discount {

    public static void applyDiscount(StoreProduct storeProduct) {
        int discountPercentage = storeProduct.getDiscounts().getPercentage();
        int originalPrice = storeProduct.getPriceRandomic();
        int productWithDiscount = originalPrice - (originalPrice * discountPercentage / 100);
        System.out.println("Loja: " + storeProduct.getName() + " Descrição: " + storeProduct.getDescription()
                + " Preço Original: " + originalPrice + " Produto com Desconto: " + productWithDiscount);
    }
}
