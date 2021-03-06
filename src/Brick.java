import Entity.AbstractEntity;

import static org.lwjgl.opengl.GL11.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @author cdsteer
 * - created 19/06/2013
 * @version *.*
 */
public class Brick extends AbstractEntity {

    private boolean used;

    public Brick(double x, double y, boolean used) {
        super(x, y, 80, 50);
        this.used = used;
    }

    @Override
    public void draw() {
        glRectd(x, y, x + width, y + height);

        glBegin(GL_QUADS);

        glEnd();
    }

    @Override
    public void update(int delta) {
        // Do nothing
    }

    public void setUsed(boolean used){
        this.used = used;
    }

    public boolean isUse(){
        return used;
    }
}
