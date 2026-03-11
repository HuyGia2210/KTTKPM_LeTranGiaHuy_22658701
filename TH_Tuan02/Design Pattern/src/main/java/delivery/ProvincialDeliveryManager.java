package delivery;

import delivery.impl.Transport;

/**
 * @author Le Tran Gia Huy
 * @created 11/03/2026 - 8:16 PM
 * @project Design Pattern
 * @package delivery
 */
public class ProvincialDeliveryManager extends DeliveryManager {
    @Override
    protected Transport createTransport() {
        return new Truck(); // Đi tỉnh thì dùng Xe tải
    }
}
