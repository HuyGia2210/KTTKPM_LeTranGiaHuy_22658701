package invoice;

import tax.TaxDecorator;

/**
 * @author Le Tran Gia Huy
 * @created 18/03/2026 - 8:09 PM
 * @project TinhToanThue
 * @package invoice
 */
public class LockedState implements InvoiceState {
    @Override
    public void addTax(InvoiceContext context, TaxDecorator taxWrapper) {
        System.out.println("[Lỗi] Hóa đơn đã chốt! Không thể áp thêm thuế.");
    }

    @Override
    public void checkout(InvoiceContext context) {
        System.out.println("[Lỗi] Hóa đơn này đã được chốt từ trước rồi.");
    }
}
