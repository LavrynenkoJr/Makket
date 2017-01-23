/**
 * Created by java-1-04 on 23.01.2017.
 */
public class Single {

    private static Single ourInstance = new Single();

    public synchronized static Single getInstance() {
        if (ourInstance==null){
            ourInstance = new Single();
        }
        return ourInstance;
    }

    private Single() {
    }
}
