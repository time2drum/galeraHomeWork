import java.util.ArrayList;

/**
 * Created by ileonovich on 1/24/2017.
 */
public class Galera {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    void setAge(int age) {
        this.age = age;
    }

    ArrayList<Department> getDepartmentArrayList() {
        return departmentArrayList;
    }

    void setDepartmentArrayList(ArrayList<Department> departmentArrayList) {
        this.departmentArrayList = departmentArrayList;
    }

    private ArrayList<Department> departmentArrayList;

}
