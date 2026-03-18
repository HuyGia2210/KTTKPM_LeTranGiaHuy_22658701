package com.order_management.order_state;

import com.order_management.order_context.OrderContext;

/**
 * @author Le Tran Gia Huy
 * @created 18/03/2026 - 7:02 PM
 * @project QuanLyDonHang
 * @package com.order_management.order_state
 */
public class NewState implements OrderState {
    @Override
    public void handle(OrderContext context) {
        System.out.println("[Trạng thái: Mới tạo] - Kiểm tra thông tin đơn hàng:");
        System.out.println(" -> Chi tiết: " + context.getOrderDetails().getDescription());
        System.out.println(" -> Tổng tiền: $" + context.getOrderDetails().getPrice());
        context.setState(new ProcessingState()); // Chuyển sang Đang xử lý
    }

    @Override
    public void cancel(OrderContext context) {
        System.out.println("[Trạng thái: Mới tạo] - Đã hủy đơn hàng. Chưa thu tiền nên không cần hoàn.");
        context.setState(new CancelledState());
    }
}