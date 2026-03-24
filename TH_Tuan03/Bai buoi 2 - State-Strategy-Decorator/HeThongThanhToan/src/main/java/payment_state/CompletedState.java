package payment_state;

import payment_bill.BillDecorator;
import payment_context.PaymentContext;
import payment_strategy.PaymentStrategy;

/**
 * @author Le Tran Gia Huy
 * @created 24/03/2026 - 10:19 PM
 * @project HeThongThanhToan
 * @package payment_state
 */
public class CompletedState implements PaymentState {
    @Override
    public void addModifier(PaymentContext context, BillDecorator modifier) {
        System.out.println("[Từ chối] Giao dịch đã hoàn tất.");
    }

    @Override
    public void selectPaymentMethod(PaymentContext context, PaymentStrategy strategy) {
        System.out.println("[Từ chối] Giao dịch đã hoàn tất.");
    }

    @Override
    public void processPayment(PaymentContext context) {
        System.out.println("[Từ chối] Giao dịch đã hoàn tất, không thể thanh toán lại.");
    }
}
