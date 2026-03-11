package packaging;

import packaging.impl.Box;

/**
 * @author Le Tran Gia Huy
 * @created 11/03/2026 - 8:04 PM
 * @project Design Pattern
 * @package packaging.impl
 */
public class CardboardBox implements Box {
    @Override
    public void packTea() {
        System.out.println("Đóng gói trà vào: Hộp Carton Tiêu Chuẩn.");
    }
}
