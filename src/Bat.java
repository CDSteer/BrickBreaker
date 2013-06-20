import Entity.AbstractMovableEntity;

import static org.lwjgl.opengl.GL11.glRectd;

/**
 * Created with IntelliJ IDEA.
 *
 * @author cdsteer
 *         - created 19/06/2013
 * @version *.*
 */
public class Bat extends AbstractMovableEntity {

    public Bat(double x, double y, double width, double height) {
        super(x, y, width, height);
    }

    @Override
    public void draw() {
        glRectd(x, y, x + width, y + height);
    }
}
