package json;

/**
 * @author Le Tran Gia Huy
 * @created 25/03/2026 - 12:05 PM
 * @project Bai3_XMLManagement_Adapter
 * @package json
 */
public class JsonWebServiceImpl implements JsonProcessor {
    @Override
    public void processJsonData(String jsonData) {
        System.out.println("[Web Service] Đang xử lý dữ liệu JSON: " + jsonData);
    }
}