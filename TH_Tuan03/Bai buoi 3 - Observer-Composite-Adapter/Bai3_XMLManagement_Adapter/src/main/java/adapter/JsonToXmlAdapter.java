package adapter;

import json.JsonProcessor;
import xml.XmlProcessor;

/**
 * @author Le Tran Gia Huy
 * @created 25/03/2026 - 12:06 PM
 * @project Bai3_XMLManagement_Adapter
 * @package adapter
 */
public class JsonToXmlAdapter implements JsonProcessor {
    private XmlProcessor xmlService; // Hệ thống cần được tương thích (Adaptee)

    public JsonToXmlAdapter(XmlProcessor xmlService) {
        this.xmlService = xmlService;
    }

    @Override
    public void processJsonData(String jsonData) {
        System.out.println("\n[Adapter 2] Đang nhận dữ liệu JSON...");
        // Logic giả lập chuyển đổi JSON -> XML
        String convertedXml = "<data>Dữ liệu đã được dịch từ JSON sang XML</data>";
        System.out.println("[Adapter 2] Đã chuyển đổi thành công sang XML!");

        // Truyền dữ liệu XML đã dịch cho Legacy System xử lý
        xmlService.processXmlData(convertedXml);
    }
}