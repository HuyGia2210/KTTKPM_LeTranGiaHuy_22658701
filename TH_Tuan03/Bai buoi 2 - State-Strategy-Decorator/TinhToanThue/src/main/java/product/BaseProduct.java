package product;

/**
 * @author Le Tran Gia Huy
 * @created 18/03/2026 - 8:05 PM
 * @project TinhToanThue
 * @package product
 */
public class BaseProduct implements IProduct {
    private String name;
    private double price;

    public BaseProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName() { return name; }

    @Override
    public double getPrice() { return price; }
}
