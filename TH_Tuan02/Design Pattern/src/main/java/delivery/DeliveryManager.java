package delivery;

import delivery.impl.Transport;
import packaging.impl.Box;
import packaging.impl.Label;
import packaging.impl.PackagingFactory;
import Logger.ShipmentLogger;

/**
 * @author Le Tran Gia Huy
 * @created 11/03/2026 - 8:13 PM
 * @project Design Pattern
 * @package delivery
 */
public abstract class DeliveryManager {
    // Factory Method (abstract)
    protected abstract Transport createTransport();

    // Template method gộp toàn bộ logic của hệ thống
    public void processOrder(PackagingFactory packagingFactory, String orderId) {
        ShipmentLogger logger = ShipmentLogger.getInstance();
        logger.log("Bắt đầu xử lý đơn hàng: " + orderId);

        // 1. Dùng Abstract Factory để đóng gói
        Box box = packagingFactory.createBox();
        Label label = packagingFactory.createLabel();
        box.packTea();
        label.printLabel();

        // 2. Dùng Factory Method để lấy phương tiện giao hàng
        Transport transport = createTransport();
        transport.deliver();

        logger.log("Đơn hàng " + orderId + " đã xuất kho thành công!\n");
    }
}
