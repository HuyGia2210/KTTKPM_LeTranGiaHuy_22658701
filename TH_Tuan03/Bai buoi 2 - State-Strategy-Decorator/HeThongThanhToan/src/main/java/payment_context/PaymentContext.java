package payment_context;

import payment_bill.BillDecorator;
import payment_bill.IPaymentBill;
import payment_state.PaymentState;
import payment_state.PendingState;
import payment_strategy.PaymentStrategy;

/**
 * @author Le Tran Gia Huy
 * @created 24/03/2026 - 10:19 PM
 * @project HeThongThanhToan
 * @package payment_context
 */
public class PaymentContext {
    private PaymentState state;
    private IPaymentBill bill;
    private PaymentStrategy paymentStrategy;

    public PaymentContext(IPaymentBill baseBill) {
        this.bill = baseBill;
        this.state = new PendingState(); // Khởi tạo luôn ở trạng thái Pending
    }

    public void setState(PaymentState state) { this.state = state; }
    public void setBill(IPaymentBill bill) { this.bill = bill; }
    public IPaymentBill getBill() { return bill; }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }
    public PaymentStrategy getPaymentStrategy() { return paymentStrategy; }

    // Hành vi do Client gọi
    public void addModifier(BillDecorator modifier) { state.addModifier(this, modifier); }
    public void selectPaymentMethod(PaymentStrategy strategy) { state.selectPaymentMethod(this, strategy); }
    public void processPayment() { state.processPayment(this); }
}
