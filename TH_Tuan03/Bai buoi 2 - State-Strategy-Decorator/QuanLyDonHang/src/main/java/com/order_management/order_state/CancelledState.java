package com.order_management.order_state;

import com.order_management.order_context.OrderContext;

/**
 * @author Le Tran Gia Huy
 * @created 18/03/2026 - 7:03 PM
 * @project QuanLyDonHang
 * @package com.order_management.order_state
 */
public class CancelledState implements OrderState {
    @Override
    public void handle(OrderContext context) {
        System.out.println("[Trạng thái: Hủy] - Đơn hàng này đã bị hủy, không thể tiếp tục xử lý.");
    }

    @Override
    public void cancel(OrderContext context) {
        System.out.println("[Trạng thái: Hủy] - Đơn hàng đã ở trạng thái hủy từ trước.");
    }
}
