import Logger.ShipmentLogger;
import delivery.DeliveryManager;
import delivery.LocalDeliveryManager;
import delivery.ProvincialDeliveryManager;
import packaging.PremiumPackagingFactory;
import packaging.StandardPackagingFactory;
import packaging.impl.PackagingFactory;

/**
 * @author Le Tran Gia Huy
 * @created 11/03/2026 - 7:55 PM
 * @project Design Pattern
 * @package PACKAGE_NAME
 */
public class DesignPatternMain {
    public static void main(String[] args) {
        ShipmentLogger logger = ShipmentLogger.getInstance();
        logger.log("--- HỆ THỐNG XUẤT ĐƠN TRÀ BẮT ĐẦU HOẠT ĐỘNG ---");

        // Đơn hàng 1: Khách ở nội thành HCM, mua gói trà thường để uống
        DeliveryManager localDelivery = new LocalDeliveryManager();
        PackagingFactory standardPack = new StandardPackagingFactory();
        localDelivery.processOrder(standardPack, "ORDER_001_LOCAL_NORMAL");

        // Đơn hàng 2: Khách ở Tỉnh khác, mua bộ trà biếu làm quà tặng
        DeliveryManager provincialDelivery = new ProvincialDeliveryManager();
        PackagingFactory premiumPack = new PremiumPackagingFactory();
        provincialDelivery.processOrder(premiumPack, "ORDER_002_PROVINCE_GIFT");
    }
}
