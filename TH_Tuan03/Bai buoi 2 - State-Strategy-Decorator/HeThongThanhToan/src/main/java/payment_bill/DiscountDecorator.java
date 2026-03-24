package payment_bill;

/**
 * @author Le Tran Gia Huy
 * @created 24/03/2026 - 10:16 PM
 * @project HeThongThanhToan
 * @package payment_bill
 */
public class DiscountDecorator extends BillDecorator {
    public DiscountDecorator(IPaymentBill bill) { super(bill); }

    @Override
    public String getDescription() { return bill.getDescription() + " - Mã giảm giá (10%)"; }

    @Override
    public double getTotal() { return bill.getTotal() * 0.90; }
}