package payment_bill;

/**
 * @author Le Tran Gia Huy
 * @created 24/03/2026 - 10:13 PM
 * @project HeThongThanhToan
 * @package payment_bill
 */
public class BaseBill implements IPaymentBill {
    private double amount;
    private String description;

    public BaseBill(double amount, String description) {
        this.amount = amount;
        this.description = description;
    }

    @Override
    public String getDescription() { return description; }

    @Override
    public double getTotal() { return amount; }
}