package investor;

import observer_subject.Observer;

/**
 * @author Le Tran Gia Huy
 * @created 24/03/2026 - 10:51 PM
 * @project Bai2_StockManagement_Observation
 * @package investor
 */
public class Investor implements Observer {
    private String name;

    public Investor(String name) { this.name = name; }

    @Override
    public void update(String stockSymbol, double price) {
        System.out.println(" -> Nhà đầu tư " + name + " nhận thông báo: " + stockSymbol + " đang có giá $" + price);
    }
}