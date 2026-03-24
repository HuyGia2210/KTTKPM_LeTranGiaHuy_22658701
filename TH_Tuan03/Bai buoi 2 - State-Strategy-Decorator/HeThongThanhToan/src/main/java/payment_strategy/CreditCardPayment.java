package payment_strategy;

/**
 * @author Le Tran Gia Huy
 * @created 24/03/2026 - 10:17 PM
 * @project HeThongThanhToan
 * @package payment_strategy
 */
public class CreditCardPayment implements PaymentStrategy {
    private String cardNumber;
    public CreditCardPayment(String cardNumber) { this.cardNumber = cardNumber; }

    @Override
    public boolean pay(double amount) {
        System.out.println("-> Đang kết nối Visa/Mastercard...");
        System.out.printf("-> Thanh toán thành công $%.2f bằng Thẻ tín dụng [%s]\n", amount, cardNumber);
        return true; // Giả lập thanh toán thành công
    }
}