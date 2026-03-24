package stock;

import observer_subject.Observer;
import observer_subject.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Le Tran Gia Huy
 * @created 24/03/2026 - 10:50 PM
 * @project Bai2_StockManagement_Observation
 * @package stock
 */
public class Stock implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String symbol;
    private double price;

    public Stock(String symbol, double price) {
        this.symbol = symbol;
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
        System.out.println("\n[Hệ thống] Giá cổ phiếu " + symbol + " vừa cập nhật thành: $" + price);
        notifyObservers(); // Tự động thông báo khi giá thay đổi
    }

    @Override
    public void attach(Observer observer) { observers.add(observer); }

    @Override
    public void detach(Observer observer) { observers.remove(observer); }

    @Override
    public void notifyObservers() {
        for (Observer obs : observers) {
            obs.update(symbol, price);
        }
    }
}