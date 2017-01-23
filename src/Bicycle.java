/**
 * Created by java-1-04 on 23.01.2017.
 */
public class Bicycle extends Cycle {

    int count = 2;

    @Override
    public void wheels() {
        System.out.println(count);
    }

    public void balance(){
        System.out.println("BALANCE count of wheels = " + count);
    }

}
