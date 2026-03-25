import adapter.JsonToXmlAdapter;
import adapter.XmlToJsonAdapter;
import json.JsonProcessor;
import json.JsonWebServiceImpl;
import xml.LegacyXmlSystemImpl;
import xml.XmlProcessor;

/**
 * @author Le Tran Gia Huy
 * @created 25/03/2026 - 12:04 PM
 * @project Bai3_XMLManagement_Adapter
 * @package PACKAGE_NAME
 */
public class Main {
    public static void main(String[] args) {
        // Khởi tạo 2 hệ thống cốt lõi
        JsonProcessor webService = new JsonWebServiceImpl();
        XmlProcessor legacySystem = new LegacyXmlSystemImpl();

        // ----------------------------------------------------
        // KỊCH BẢN 1: Gửi XML vào Web Service (Cần Adapter 1)
        // ----------------------------------------------------
        System.out.println("=== KỊCH BẢN 1: HỆ THỐNG CŨ GỬI DỮ LIỆU LÊN WEB SERVICE ===");
        String rawXml = "<user><name>John Doe</name></user>";

        // Dùng adapter để "bọc" webService lại dưới vỏ bọc của 1 XmlProcessor
        XmlProcessor adapter1 = new XmlToJsonAdapter(webService);
        adapter1.processXmlData(rawXml);

        // ----------------------------------------------------
        // KỊCH BẢN 2: Web Service phản hồi bằng JSON xuống Hệ thống cũ (Cần Adapter 2)
        // ----------------------------------------------------
        System.out.println("\n=== KỊCH BẢN 2: WEB SERVICE PHẢN HỒI XUỐNG HỆ THỐNG CŨ ===");
        String rawJson = "{ \"user\": { \"name\": \"John Doe\" } }";

        // Dùng adapter để "bọc" legacySystem lại dưới vỏ bọc của 1 JsonProcessor
        JsonProcessor adapter2 = new JsonToXmlAdapter(legacySystem);
        adapter2.processJsonData(rawJson);
    }
}
