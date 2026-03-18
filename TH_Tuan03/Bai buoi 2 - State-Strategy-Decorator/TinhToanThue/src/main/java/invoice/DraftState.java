package invoice;

import tax.TaxDecorator;

/**
 * @author Le Tran Gia Huy
 * @created 18/03/2026 - 8:09 PM
 * @project TinhToanThue
 * @package invoice
 */
public class DraftState implements InvoiceState {
    @Override
    public void addTax(InvoiceContext context, TaxDecorator taxWrapper) {
        // Cập nhật sản phẩm với lớp thuế mới
        context.setProduct(taxWrapper);
        System.out.println("Đã áp dụng thuế: " + taxWrapper.getName());
    }

    @Override
    public void checkout(InvoiceContext context) {
        System.out.println("Chốt hóa đơn. Chuyển sang trạng thái KHÓA.");
        context.setState(new LockedState());
    }
}
