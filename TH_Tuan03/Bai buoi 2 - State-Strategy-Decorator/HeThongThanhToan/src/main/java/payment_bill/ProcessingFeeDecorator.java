package payment_bill;

/**
 * @author Le Tran Gia Huy
 * @created 24/03/2026 - 10:15 PM
 * @project HeThongThanhToan
 * @package payment_bill
 */
public class ProcessingFeeDecorator extends BillDecorator {
    public ProcessingFeeDecorator(IPaymentBill bill) { super(bill); }

    @Override
    public String getDescription() { return bill.getDescription() + " + Phí xử lý ($2.0)"; }

    @Override
    public double getTotal() { return bill.getTotal() + 2.0; }
}
