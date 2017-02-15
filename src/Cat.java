import java.io.Serializable;

/**
 * Created by java-1-04 on 30.01.2017.
 */
public class Cat implements Serializable, Cloneable {

    private int name;


    public Cat() {
    }

    public Cat(int name) {
        this.name = name;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
