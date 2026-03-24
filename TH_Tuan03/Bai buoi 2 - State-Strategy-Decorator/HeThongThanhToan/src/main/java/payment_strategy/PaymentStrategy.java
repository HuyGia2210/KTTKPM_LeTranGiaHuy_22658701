package payment_strategy;

/**
 * @author Le Tran Gia Huy
 * @created 24/03/2026 - 10:16 PM
 * @project HeThongThanhToan
 * @package payment_strategy
 */
public interface PaymentStrategy {
    boolean pay(double amount);
}
