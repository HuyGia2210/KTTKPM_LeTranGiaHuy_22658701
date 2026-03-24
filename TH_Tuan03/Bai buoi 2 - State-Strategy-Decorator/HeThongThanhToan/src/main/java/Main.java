import payment_bill.BaseBill;
import payment_bill.DiscountDecorator;
import payment_bill.IPaymentBill;
import payment_bill.ProcessingFeeDecorator;
import payment_context.PaymentContext;
import payment_strategy.CreditCardPayment;
import payment_strategy.PayPalPayment;

/**
 * @author Le Tran Gia Huy
 * @created 24/03/2026 - 10:12 PM
 * @project HeThongThanhToan
 * @package PACKAGE_NAME
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== KỊCH BẢN: THANH TOÁN KHÓA HỌC TRỰC TUYẾN ===");

        // 1. Tạo hóa đơn gốc ($100)
        IPaymentBill courseBill = new BaseBill(100.0, "Khóa học Design Pattern");
        PaymentContext checkout = new PaymentContext(courseBill);

        // 2. Thêm Mã giảm giá 10% (Trạng thái Pending)
        checkout.addModifier(new DiscountDecorator(checkout.getBill()));

        // 3. Hệ thống tính thêm Phí xử lý giao dịch $2 (Trạng thái Pending)
        checkout.addModifier(new ProcessingFeeDecorator(checkout.getBill()));

        // 4. Chọn thanh toán bằng PayPal
        checkout.selectPaymentMethod(new PayPalPayment("user@example.com"));

        System.out.println("\n--- BẮT ĐẦU XỬ LÝ THANH TOÁN ---");
        // 5. Tiến hành thanh toán (Sẽ tự động chuyển sang Processing -> Gọi PayPal -> Completed)
        checkout.processPayment();

        System.out.println("\n--- THỬ THAY ĐỔI SAU KHI HOÀN TẤT ---");
        // 6. Thử ép hệ thống giảm giá lại hoặc đổi thẻ tín dụng khi đã thanh toán xong
        checkout.addModifier(new DiscountDecorator(checkout.getBill()));
        checkout.selectPaymentMethod(new CreditCardPayment("1234-5678"));
        checkout.processPayment();
    }
}
