/**
 * Created by java-1-04 on 18.01.2017.
 */
abstract public class Mashine {
    private String color;
    private int weigth;
    private int speed;

    public Mashine(String color, int weigth, int speed) {
        this.color = color;
        this.weigth = weigth;
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeigth() {
        return weigth;
    }

    public void setWeigth(int weigth) {
        this.weigth = weigth;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Mashine{" +
                "color='" + color + '\'' +
                ", weigth=" + weigth +
                ", speed=" + speed +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        Mashine mashine = (Mashine) o;
//
//        if (!color.equals(mashine.color)) return false;
//
//        return true;
//    }

    @Override
    public int hashCode() {
        return color.hashCode();
    }
}
