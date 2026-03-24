package payment_state;

import payment_bill.BillDecorator;
import payment_context.PaymentContext;
import payment_strategy.PaymentStrategy;

/**
 * @author Le Tran Gia Huy
 * @created 24/03/2026 - 10:18 PM
 * @project HeThongThanhToan
 * @package payment_state
 */
public interface PaymentState {
    void addModifier(PaymentContext context, BillDecorator modifier);
    void selectPaymentMethod(PaymentContext context, PaymentStrategy strategy);
    void processPayment(PaymentContext context);
}
