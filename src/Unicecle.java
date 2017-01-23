/**
 * Created by java-1-04 on 23.01.2017.
 */
public class Unicecle extends Cycle {

    int count = 1;

    @Override
    public void wheels() {
        System.out.println(count);
    }

    public void balance(){
        System.out.println("BALANCE count of wheels = " + count);
    }

}
