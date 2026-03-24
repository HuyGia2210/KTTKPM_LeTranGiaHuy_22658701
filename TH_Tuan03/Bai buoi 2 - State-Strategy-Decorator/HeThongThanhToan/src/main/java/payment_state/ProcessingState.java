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
public class ProcessingState implements PaymentState {
    @Override
    public void addModifier(PaymentContext context, BillDecorator modifier) {
        System.out.println("[Lỗi] Giao dịch đang được xử lý, không thể thay đổi số tiền.");
    }

    @Override
    public void selectPaymentMethod(PaymentContext context, PaymentStrategy strategy) {
        System.out.println("[Lỗi] Giao dịch đang được xử lý, không thể đổi phương thức.");
    }

    @Override
    public void processPayment(PaymentContext context) {
        double finalAmount = context.getBill().getTotal();
        boolean isSuccess = context.getPaymentStrategy().pay(finalAmount);

        if (isSuccess) {
            System.out.println("Giao dịch thành công! Chuyển trạng thái sang: HOÀN TẤT.");
            context.setState(new CompletedState());
        } else {
            System.out.println("Giao dịch thất bại!");
            // Trong thực tế sẽ chuyển sang FailedState
        }
    }
}