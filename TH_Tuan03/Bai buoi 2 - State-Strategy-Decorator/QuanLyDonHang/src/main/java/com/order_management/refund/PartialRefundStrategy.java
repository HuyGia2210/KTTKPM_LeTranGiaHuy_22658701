package com.order_management.refund;

/**
 * @author Le Tran Gia Huy
 * @created 18/03/2026 - 6:55 PM
 * @project QuanLyDonHang
 * @package com.order_management.refund
 */
public class PartialRefundStrategy implements RefundStrategy {
    @Override
    public void doRefund(double amount) {
        System.out.println("Đã hoàn tiền 50%: $" + (amount * 0.5));
    }
}
