package invoice;

import tax.TaxDecorator;

/**
 * @author Le Tran Gia Huy
 * @created 18/03/2026 - 8:08 PM
 * @project TinhToanThue
 * @package invoice
 */
public interface InvoiceState {
    void addTax(InvoiceContext context, TaxDecorator taxWrapper);
    void checkout(InvoiceContext context);
}
