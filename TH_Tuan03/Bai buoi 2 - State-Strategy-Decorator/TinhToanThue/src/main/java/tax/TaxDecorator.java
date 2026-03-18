package tax;

import product.IProduct;

/**
 * @author Le Tran Gia Huy
 * @created 18/03/2026 - 8:05 PM
 * @project TinhToanThue
 * @package product
 */
public abstract class TaxDecorator implements IProduct {
    protected IProduct product;

    public TaxDecorator(IProduct product) {
        this.product = product;
    }
}
