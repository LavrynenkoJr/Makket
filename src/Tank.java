/**
 * Created by java-1-04 on 18.01.2017.
 */
public class Tank {

    private int gun;


    public Tank() {

    }

    /*public Tank(String color, int weigth, int speed, int gun) {
        super(color, weigth, speed);
        this.gun=gun;

        getSome();
    }*/

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

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("finalize");

    }

    private void getSome(String arg){
        System.out.println("first " + arg);
    }

    private void getSome(String... arg){
        for (String s: arg){
            System.out.println("second" + s);
        }
    }
}
