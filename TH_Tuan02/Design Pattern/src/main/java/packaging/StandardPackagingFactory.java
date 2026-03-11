package packaging;

import packaging.impl.Box;
import packaging.impl.Label;
import packaging.impl.PackagingFactory;

/**
 * @author Le Tran Gia Huy
 * @created 11/03/2026 - 8:08 PM
 * @project Design Pattern
 * @package packaging
 */
public class StandardPackagingFactory implements PackagingFactory {
    public Box createBox() { return new CardboardBox(); }
    public Label createLabel() { return new StandardLabel(); }
}
