package com.order_management.refund;

/**
 * @author Le Tran Gia Huy
 * @created 18/03/2026 - 6:53 PM
 * @project QuanLyDonHang
 * @package com.order_management.refund
 */
public interface RefundStrategy {
    void doRefund(double amount);
}
