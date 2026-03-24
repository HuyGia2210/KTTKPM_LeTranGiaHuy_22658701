package payment_bill;

/**
 * @author Le Tran Gia Huy
 * @created 24/03/2026 - 10:15 PM
 * @project HeThongThanhToan
 * @package payment_bill
 */
public abstract class BillDecorator implements IPaymentBill {
    protected IPaymentBill bill;
    public BillDecorator(IPaymentBill bill) { this.bill = bill; }
}
