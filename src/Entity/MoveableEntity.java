package Entity;

/**
 * @author cdsteer
 * - created 19.23.2013
 * @version 1.0
 */
public interface MoveableEntity extends Entity{
    public double getDX();
    public double getDY();

    public void setDX(double dx);
    public void setDY(double dy);

}
