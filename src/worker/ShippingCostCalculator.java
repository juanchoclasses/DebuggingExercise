package worker;

/**
 * ShippingCostCalculator
 */
public class ShippingCostCalculator {
  private final double[] productPrices;
  private final boolean[] isFreeShipping;// Array field to store product scores
  private final String[] productNames;

  /**
   * Constructor for the calculator
   *
   * @param productPrices
   * @param productNames
   * @param isFreeShipping
   */
  public ShippingCostCalculator(double[] productPrices,
                                String[] productNames, boolean[] isFreeShipping) {
    this.productPrices = productPrices;
    this.productNames = productNames;
    this.isFreeShipping = isFreeShipping;
  }

  /**
   * Get the shipping cost for a product, if it is greater than 25 then it is free
   * Otherwise it is 20 % of the cost, rounded to the nearest integer
   *
   * @param index
   * @return shippingCost
   */
  public double getShippingCost(int index) {
    double shippingCost = 0;
    if (this.productPrices[index] < 250) {
      return this.productPrices[index] * 0.2;
    }
    return shippingCost;
  }

  /**
   * Check if the product has free shipping
   *
   * @param index, the index of the product
   * @return boolean
   */
  public boolean isFreeShipping(int index) {
    return this.isFreeShipping[index];
  }

  /**
   * Get the name of the product
   *
   * @param index, the index of the product
   * @return product name
   */
  public String getProductName(int index) {
    return this.productNames[index];
  }

}