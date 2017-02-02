import java.util.ArrayList;
import java.util.List;

/**
 * Created by ileonovich on 1/24/2017.
 */
class Department {
    private String name;
    private int floor;
    private ArrayList<Developer> developerList;

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public int getFloor() {
        return floor;
    }

    void setFloor(int floor) {
        this.floor = floor;
    }

    ArrayList<Developer> getDeveloperList() {
        return developerList;
    }

    public void setDeveloperList(ArrayList<Developer> developerList) {
        this.developerList = developerList;
    }


}
