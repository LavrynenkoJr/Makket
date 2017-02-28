import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class Monitoring implements Observer {

    private List<Room> roomList;

    public Monitoring(List<Room> roomList) {
        this.roomList = roomList;
        for (int i = 0; i < roomList.size(); i++){
            roomList.get(i).addObserver(this);
        }
    }

    @Override
    public void update(Observable o, Object arg) {

        String s = "";
        for (int i = 0; i<roomList.size(); i++){

            s += roomList.get(i).toString();

        }
        System.out.print("\r" + s);
    }
}