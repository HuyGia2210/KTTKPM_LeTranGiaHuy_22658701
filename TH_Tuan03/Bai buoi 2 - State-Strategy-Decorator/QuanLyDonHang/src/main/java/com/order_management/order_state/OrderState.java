package com.order_management.order_state;

import com.order_management.order_context.OrderContext;

/**
 * @author Le Tran Gia Huy
 * @created 18/03/2026 - 7:00 PM
 * @project QuanLyDonHang
 * @package com.order_management.order_state
 */
public interface OrderState {
    void handle(OrderContext context);
    void cancel(OrderContext context);
}
