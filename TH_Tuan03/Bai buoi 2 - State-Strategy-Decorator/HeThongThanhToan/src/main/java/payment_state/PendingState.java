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
public class PendingState implements PaymentState {
    @Override
    public void addModifier(PaymentContext context, BillDecorator modifier) {
        context.setBill(modifier);
        System.out.println("Đã cập nhật hóa đơn: " + modifier.getDescription());
    }

    @Override
    public void selectPaymentMethod(PaymentContext context, PaymentStrategy strategy) {
        context.setPaymentStrategy(strategy);
        System.out.println("Đã chọn phương thức thanh toán mới.");
    }

    @Override
    public void processPayment(PaymentContext context) {
        if (context.getPaymentStrategy() == null) {
            System.out.println("[Lỗi] Vui lòng chọn phương thức thanh toán trước khi xử lý!");
            return;
        }
        System.out.println("Chuyển trạng thái giao dịch sang: ĐANG XỬ LÝ...");
        context.setState(new ProcessingState());
        context.processPayment(); // Tự động chạy tiếp logic xử lý
    }
}