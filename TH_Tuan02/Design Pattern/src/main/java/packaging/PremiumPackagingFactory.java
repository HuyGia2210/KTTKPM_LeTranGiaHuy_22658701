package packaging;

import packaging.impl.Box;
import packaging.impl.Label;
import packaging.impl.PackagingFactory;
import packaging.impl.PremiumLabel;

/**
 * @author Le Tran Gia Huy
 * @created 11/03/2026 - 8:09 PM
 * @project Design Pattern
 * @package packaging
 */
public class PremiumPackagingFactory implements PackagingFactory {
    public Box createBox() { return new WoodenBox(); }
    public Label createLabel() { return new PremiumLabel(); }
}
