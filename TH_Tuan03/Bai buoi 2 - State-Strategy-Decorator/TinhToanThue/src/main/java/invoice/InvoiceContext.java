package invoice;

import discount.DiscountStrategy;
import product.IProduct;
import tax.TaxDecorator;

/**
 * @author Le Tran Gia Huy
 * @created 18/03/2026 - 8:10 PM
 * @project TinhToanThue
 * @package invoice
 */
public class InvoiceContext {
    private InvoiceState state;
    private IProduct product;
    private DiscountStrategy discountStrategy;

    public InvoiceContext(IProduct product, DiscountStrategy discountStrategy) {
        this.product = product;
        this.discountStrategy = discountStrategy;
        this.state = new DraftState(); // Bắt đầu ở trạng thái Nháp
    }

    public void setState(InvoiceState state) { this.state = state; }
    public void setProduct(IProduct product) { this.product = product; }
    public IProduct getProduct() { return product; }

    // Thử áp thêm một lớp thuế
    public void applyTax(TaxDecorator taxWrapper) {
        state.addTax(this, taxWrapper);
    }

    // Chốt hóa đơn
    public void checkout() {
        state.checkout(this);
    }

    // In hóa đơn cuối cùng
    public void printInvoice() {
        System.out.println("\n--- BIÊN LAI THANH TOÁN ---");
        System.out.println("Sản phẩm: " + product.getName());

        double finalPrice = discountStrategy.applyDiscount(product.getPrice());
        System.out.printf("Tổng tiền cần thanh toán: $%.2f\n", finalPrice);
        System.out.println("---------------------------\n");
    }
}
