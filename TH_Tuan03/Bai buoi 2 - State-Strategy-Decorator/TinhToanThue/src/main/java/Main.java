import discount.NormalCustomerStrategy;
import discount.VipCustomerStrategy;
import invoice.InvoiceContext;
import product.BaseProduct;
import product.IProduct;
import tax.LuxuryTax;
import tax.VatTax;

/**
 * @author Le Tran Gia Huy
 * @created 18/03/2026 - 8:03 PM
 * @project TinhToanThue
 * @package PACKAGE_NAME
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== TRƯỜNG HỢP 1: MUA ĐIỆN THOẠI XA XỈ (Khách VIP) ===");
        IProduct iphone = new BaseProduct("iPhone 15 Pro Max", 1000.0);

        // Khởi tạo hóa đơn cho khách VIP
        InvoiceContext invoice1 = new InvoiceContext(iphone, new VipCustomerStrategy());

        // Đang ở trạng thái Draft -> Cho phép áp thuế chồng lên nhau
        invoice1.applyTax(new VatTax(invoice1.getProduct())); // Giá = 1000 * 1.1 = 1100
        invoice1.applyTax(new LuxuryTax(invoice1.getProduct())); // Giá = 1100 * 1.2 = 1320

        // Chốt hóa đơn
        invoice1.checkout();

        // Thử áp thêm thuế sau khi đã chốt (Sẽ báo lỗi State)
        invoice1.applyTax(new VatTax(invoice1.getProduct()));

        // In ra bill cuối cùng
        invoice1.printInvoice();


        System.out.println("=== TRƯỜNG HỢP 2: MUA BÁNH MÌ (Khách Thường) ===");
        IProduct bread = new BaseProduct("Bánh Mì Kẹp", 5.0);

        // Khách thường, mua đồ ăn chỉ chịu VAT
        InvoiceContext invoice2 = new InvoiceContext(bread, new NormalCustomerStrategy());
        invoice2.applyTax(new VatTax(invoice2.getProduct()));
        invoice2.checkout();
        invoice2.printInvoice();
    }
}
