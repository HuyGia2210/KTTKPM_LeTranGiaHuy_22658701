package com.order_management.order_state;

import com.order_management.order_context.OrderContext;

/**
 * @author Le Tran Gia Huy
 * @created 18/03/2026 - 7:03 PM
 * @project QuanLyDonHang
 * @package com.order_management.order_state
 */
public class DeliveredState implements OrderState {
    @Override
    public void handle(OrderContext context) {
        System.out.println("[Trạng thái: Đã giao] - Cập nhật trạng thái thành công. Đơn hàng đã đến tay khách.");
    }

    @Override
    public void cancel(OrderContext context) {
        System.out.println("[Trạng thái: Đã giao] - Không thể hủy đơn hàng đã giao thành công!");
    }
}