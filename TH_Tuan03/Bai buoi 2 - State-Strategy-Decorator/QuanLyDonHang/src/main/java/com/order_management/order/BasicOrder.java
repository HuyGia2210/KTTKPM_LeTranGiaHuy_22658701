package com.order_management.order;

/**
 * @author Le Tran Gia Huy
 * @created 18/03/2026 - 6:44 PM
 * @project QuanLyDonHang
 * @package com.order_management.order
 */
public class BasicOrder implements IOrder{
    @Override
    public String getDescription() { return "Đơn hàng tiêu chuẩn"; }
    @Override
    public double getPrice() { return 100.0; } // Giá gốc
}
