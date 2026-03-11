package delivery;

import delivery.impl.Transport;

/**
 * @author Le Tran Gia Huy
 * @created 11/03/2026 - 8:12 PM
 * @project Design Pattern
 * @package delivery
 */
public class Truck implements Transport {
    public void deliver() { System.out.println("Vận chuyển bằng: Xe Tải (Chở số lượng lớn đi tỉnh)."); }
}
