package adapter;

import json.JsonProcessor;
import xml.XmlProcessor;

/**
 * @author Le Tran Gia Huy
 * @created 25/03/2026 - 12:06 PM
 * @project Bai3_XMLManagement_Adapter
 * @package adapter
 */
public class XmlToJsonAdapter implements XmlProcessor {
    private JsonProcessor jsonService; // Hệ thống cần được tương thích (Adaptee)

    public XmlToJsonAdapter(JsonProcessor jsonService) {
        this.jsonService = jsonService;
    }

    @Override
    public void processXmlData(String xmlData) {
        System.out.println("\n[Adapter 1] Đang nhận dữ liệu XML...");
        // Logic giả lập chuyển đổi XML -> JSON
        String convertedJson = "{ \"data\": \"Dữ liệu đã được dịch từ XML sang JSON\" }";
        System.out.println("[Adapter 1] Đã chuyển đổi thành công sang JSON!");

        // Truyền dữ liệu JSON đã dịch cho Web Service xử lý
        jsonService.processJsonData(convertedJson);
    }
}