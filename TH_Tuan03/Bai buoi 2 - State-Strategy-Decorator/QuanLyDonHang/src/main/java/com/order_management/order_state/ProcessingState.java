package com.order_management.order_state;

import com.order_management.order_context.OrderContext;

/**
 * @author Le Tran Gia Huy
 * @created 18/03/2026 - 7:02 PM
 * @project QuanLyDonHang
 * @package com.order_management.order_state
 */
public class ProcessingState implements OrderState {
    @Override
    public void handle(OrderContext context) {
        System.out.println("[Trạng thái: Đang xử lý] - Đang đóng gói và vận chuyển đơn hàng...");
        context.setState(new DeliveredState()); // Chuyển sang Đã giao
    }

    @Override
    public void cancel(OrderContext context) {
        System.out.println("[Trạng thái: Đang xử lý] - Đã hủy đơn hàng trong lúc vận chuyển.");
        context.setState(new CancelledState());
        context.getRefundStrategy().doRefund(context.getOrderDetails().getPrice());
    }
}
