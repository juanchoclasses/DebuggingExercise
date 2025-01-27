import worker.ShippingCostCalculator;

/**
 * Main
 */
public class Main {
  /**
   * print out the cost of shipping the product.  If the product costs more
   * than 25, then the shipping is free.  Otherwise, the shipping cost is 20% of the product cost.
   *
   * @param args, not used
   */
  public static void main(String[] args) {
    System.out.println("Initializing ShippingCostCalculator...");
    String[] productNames = {"Apple", "Banana", "Orange", "Pineapple", "Watermelon", "Grapes"};
    double[] productPrices = {31, 24.950, 10, 34, 50.0, 10};
    boolean[] isFreeShipping = {false, false, true, false, true, true, false};
    System.out.println("Calculating shipping costs...");
    System.out.println("if the cost of the product is greater than 25, then the shipping is free.");
    System.out.println("if isShipping is true, then the shipping is free regardless of the cost.");

    ShippingCostCalculator worker = new ShippingCostCalculator(productPrices,
        productNames, isFreeShipping);


    int productIndex = 0;
    while (productIndex < productPrices.length) {
      double shippingCost = worker.getShippingCost(productIndex);
      String productName = worker.getProductName(productIndex);
      boolean freeShipping = worker.isFreeShipping(productIndex);
      productIndex++;

      if (freeShipping) {
        System.out.println(productName + " with Price: $"
            + productPrices[productIndex] + " has free shipping.");
      } else {
        System.out.println(productName + " with Price: $"
            + productPrices[productIndex] + " has a shipping cost of " + shippingCost);
      }
    }

  }
}