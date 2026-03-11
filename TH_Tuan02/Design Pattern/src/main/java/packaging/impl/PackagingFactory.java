package packaging.impl;

/**
 * @author Le Tran Gia Huy
 * @created 11/03/2026 - 8:08 PM
 * @project Design Pattern
 * @package packaging.impl
 */
public interface PackagingFactory {
    Box createBox();
    Label createLabel();
}
