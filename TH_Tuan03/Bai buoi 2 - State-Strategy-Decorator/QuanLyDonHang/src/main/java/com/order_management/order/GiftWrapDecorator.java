package com.order_management.order;

/**
 * @author Le Tran Gia Huy
 * @created 18/03/2026 - 6:50 PM
 * @project QuanLyDonHang
 * @package com.order_management.order
 */
public class GiftWrapDecorator extends OrderDecorator{
    public GiftWrapDecorator(IOrder order) { super(order); }
    @Override
    public String getDescription() { return order.getDescription() + " + Gói quà"; }
    @Override
    public double getPrice() { return order.getPrice() + 15.0; }
}
