package discount;

/**
 * @author Le Tran Gia Huy
 * @created 18/03/2026 - 8:07 PM
 * @project TinhToanThue
 * @package discount
 */
public class NormalCustomerStrategy implements DiscountStrategy {
    @Override
    public double applyDiscount(double finalPrice) {
        return finalPrice;
    }
}
