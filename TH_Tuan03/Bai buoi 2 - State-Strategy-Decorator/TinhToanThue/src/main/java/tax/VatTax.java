package tax;

import product.IProduct;

/**
 * @author Le Tran Gia Huy
 * @created 18/03/2026 - 8:06 PM
 * @project TinhToanThue
 * @package tax
 */
public class VatTax extends TaxDecorator {
    public VatTax(IProduct product) { super(product); }

    @Override
    public String getName() { return product.getName() + " [+VAT 10%]"; }

    @Override
    public double getPrice() { return product.getPrice() * 1.10; }
}
