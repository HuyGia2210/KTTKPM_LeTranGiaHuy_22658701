package delivery;

import delivery.impl.Transport;

/**
 * @author Le Tran Gia Huy
 * @created 11/03/2026 - 8:11 PM
 * @project Design Pattern
 * @package delivery.impl
 */
public class Motorbike implements Transport {
    public void deliver() { System.out.println("Vận chuyển bằng: Xe Máy (Nhanh chóng trong nội thành)."); }
}
