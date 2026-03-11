package logger;

/**
 * @author Le Tran Gia Huy
 * @created 11/03/2026 - 7:56 PM
 * @project Design Pattern
 * @package PACKAGE_NAME
 */

public class ShipmentLogger {
    private ShipmentLogger() {
        System.out.println(">>> [SYSTEM] Initializing Shipment logger...");
    }

    // Lớp inner static để giữ instance
    private static class LoggerHelper {
        private static final ShipmentLogger INSTANCE = new ShipmentLogger();
    }

    public static ShipmentLogger getInstance() {
        return LoggerHelper.INSTANCE;
    }

    public void log(String message) {
        System.out.println("[LOG]: " + message);
    }
}
