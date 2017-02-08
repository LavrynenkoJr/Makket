import java.io.Serializable;

/**
 * Created by java-1-04 on 30.01.2017.
 */
public class Cat implements Serializable, Cloneable {

    public String name;


    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
