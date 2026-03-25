package xml;

/**
 * @author Le Tran Gia Huy
 * @created 25/03/2026 - 12:05 PM
 * @project Bai3_XMLManagement_Adapter
 * @package xml
 */
public class LegacyXmlSystemImpl implements XmlProcessor {
    @Override
    public void processXmlData(String xmlData) {
        System.out.println("[Legacy System] Đang xử lý dữ liệu XML: " + xmlData);
    }
}