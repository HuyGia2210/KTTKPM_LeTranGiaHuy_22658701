package tax;

import product.IProduct;

/**
 * @author Le Tran Gia Huy
 * @created 18/03/2026 - 8:06 PM
 * @project TinhToanThue
 * @package tax
 */
public class LuxuryTax extends TaxDecorator {
    public LuxuryTax(IProduct product) { super(product); }

    @Override
    public String getName() { return product.getName() + " [+Thuế Xa xỉ 20%]"; }

    @Override
    public double getPrice() { return product.getPrice() * 1.20; }
}
