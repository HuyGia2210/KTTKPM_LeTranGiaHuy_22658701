package discount;

/**
 * @author Le Tran Gia Huy
 * @created 18/03/2026 - 8:08 PM
 * @project TinhToanThue
 * @package discount
 */
public class VipCustomerStrategy implements DiscountStrategy {
    @Override
    public double applyDiscount(double finalPrice) {
        System.out.println(" -> (Áp dụng giảm giá VIP 5%)");
        return finalPrice * 0.95;
    }
}
