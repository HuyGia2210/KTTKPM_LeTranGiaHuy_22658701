package payment_strategy;

/**
 * @author Le Tran Gia Huy
 * @created 24/03/2026 - 10:17 PM
 * @project HeThongThanhToan
 * @package payment_strategy
 */
public class PayPalPayment implements PaymentStrategy {
    private String email;
    public PayPalPayment(String email) { this.email = email; }

    @Override
    public boolean pay(double amount) {
        System.out.println("-> Đang chuyển hướng sang cổng PayPal...");
        System.out.printf("-> Thanh toán thành công $%.2f bằng tài khoản PayPal [%s]\n", amount, email);
        return true;
    }
}