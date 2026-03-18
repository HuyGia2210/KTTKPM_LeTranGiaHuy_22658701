package com.order_management.order_context;

import com.order_management.order.IOrder;
import com.order_management.order_state.NewState;
import com.order_management.order_state.OrderState;
import com.order_management.refund.RefundStrategy;

/**
 * @author Le Tran Gia Huy
 * @created 18/03/2026 - 7:03 PM
 * @project QuanLyDonHang
 * @package com.order_management.order_context
 */
public class OrderContext {
    private OrderState state;
    private IOrder orderDetails;
    private RefundStrategy refundStrategy;

    public OrderContext(IOrder orderDetails, RefundStrategy refundStrategy) {
        this.orderDetails = orderDetails;
        this.refundStrategy = refundStrategy;
        this.state = new NewState(); // Khởi tạo luôn ở trạng thái New
    }

    public void setState(OrderState state) { this.state = state; }
    public IOrder getOrderDetails() { return orderDetails; }
    public RefundStrategy getRefundStrategy() { return refundStrategy; }

    // Gọi hành vi xử lý tiếp theo
    public void processNext() {
        state.handle(this);
    }

    // Gọi hành vi hủy
    public void cancelOrder() {
        state.cancel(this);
    }
}
