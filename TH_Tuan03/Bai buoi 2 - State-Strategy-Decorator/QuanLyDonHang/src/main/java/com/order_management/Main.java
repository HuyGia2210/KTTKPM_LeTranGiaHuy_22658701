package com.order_management;

import com.order_management.order.BasicOrder;
import com.order_management.order.GiftWrapDecorator;
import com.order_management.order.IOrder;
import com.order_management.order_context.OrderContext;
import com.order_management.refund.FullRefundStrategy;
import com.order_management.refund.PartialRefundStrategy;

/**
 * @author Le Tran Gia Huy
 * @created 18/03/2026 - 6:41 PM
 * @project QuanLyDonHang
 * @package com.order_management
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== KỊCH BẢN 1: ĐƠN HÀNG THÀNH CÔNG ===");
        // Dùng Decorator để tạo đơn hàng có gói quà
        IOrder myOrder = new GiftWrapDecorator(new BasicOrder());
        // Dùng Strategy để định nghĩa cách hoàn tiền (nếu có)
        OrderContext order1 = new OrderContext(myOrder, new FullRefundStrategy());

        order1.processNext(); // Mới tạo -> Đang xử lý
        order1.processNext(); // Đang xử lý -> Đã giao
        order1.processNext(); // Đã giao -> In thông báo

        System.out.println("\n=== KỊCH BẢN 2: HỦY ĐƠN HÀNG KHI ĐANG XỬ LÝ ===");
        OrderContext order2 = new OrderContext(new BasicOrder(), new PartialRefundStrategy());
        order2.processNext(); // Mới tạo -> Đang xử lý
        order2.cancelOrder(); // Hủy khi đang xử lý -> Gọi Partial Refund
    }
}
