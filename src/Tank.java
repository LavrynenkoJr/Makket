/**
 * Created by java-1-04 on 18.01.2017.
 */
public class Tank extends Mashine{

    private int gun;


    public Tank(String color, int weigth, int speed, int gun) {
        super(color, weigth, speed);
        this.gun=gun;
    }

    public int getGun() {
        return gun;
    }

    public void setGun(int gun) {
        this.gun = gun;
    }

    @Override
    public String toString() {
        return super.toString()+ "Gun=" + gun;
    }
}
