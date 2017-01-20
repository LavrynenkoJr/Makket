/**
 * Created by java-1-04 on 18.01.2017.
 */
public class Plane extends Mashine{


    private int maxHeight;


    public Plane(String color, int weigth, int speed, int maxHeight) {
        super(color, weigth, speed);
        this.maxHeight=maxHeight;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public void setMaxHeight(int maxHeight) {
        this.maxHeight = maxHeight;
    }

    @Override
    public String toString() {
        return super.toString() + "maxHeight=" + maxHeight;
    }
}
