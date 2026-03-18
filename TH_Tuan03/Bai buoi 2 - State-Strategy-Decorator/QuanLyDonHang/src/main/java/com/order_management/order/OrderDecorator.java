package com.order_management.order;

/**
 * @author Le Tran Gia Huy
 * @created 18/03/2026 - 6:49 PM
 * @project QuanLyDonHang
 * @package com.order_management.order
 */
public abstract class OrderDecorator implements IOrder {
    protected IOrder order;
    public OrderDecorator(IOrder order) { this.order = order; }
}