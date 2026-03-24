import investor.Investor;
import stock.Stock;

/**
 * @author Le Tran Gia Huy
 * @created 24/03/2026 - 10:49 PM
 * @project Bai2_StockManagement_Observation
 * @package PACKAGE_NAME
 */
public class Main {
    public static void main(String[] args) {
        Stock appleStock = new Stock("AAPL", 150.0);

        Investor inv1 = new Investor("Alice");
        Investor inv2 = new Investor("Bob");

        // Đăng ký theo dõi
        appleStock.attach(inv1);
        appleStock.attach(inv2);

        // Thay đổi giá -> Tự động bắn thông báo
        appleStock.setPrice(152.5);

        // Bob hủy theo dõi, thêm Charlie
        appleStock.detach(inv2);
        appleStock.attach(new Investor("Charlie"));

        appleStock.setPrice(149.0);
    }
}
