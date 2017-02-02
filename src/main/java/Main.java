import java.util.ArrayList;
import java.util.List;

/**
 * Created by ileonovich on 1/24/2017.
 */
public class Main {
    public static void main(String[] args) {

        Developer tmp0 = new Developer();
        tmp0.setExperience(2.68);
        tmp0.setFirstName("Ivan");
        tmp0.setLastName("Ivanov");

        Developer tmp1 = new Developer();
        tmp1.setExperience(0);
        tmp1.setFirstName("Dmitry");
        tmp1.setLastName("Dubrov");

        Developer tmp2 = new Developer();
        tmp2.setExperience(6.0);
        tmp2.setFirstName("Maria");
        tmp2.setLastName("Marchenkova");

        Developer tmp3 = new Developer();
        tmp3.setExperience(3.45);
        tmp3.setFirstName("Natalya");
        tmp3.setLastName("Vetlitskaya");

        Developer tmp4 = new Developer();
        tmp4.setExperience(7.3);
        tmp4.setFirstName("Alexey");
        tmp4.setLastName("Griboedov");

        Developer tmp5 = new Developer();
        tmp5.setExperience(2.5);
        tmp5.setFirstName("Alan");
        tmp5.setLastName("Harisson");

        Developer tmp6 = new Developer();
        tmp6.setExperience(1.5);
        tmp6.setFirstName("Michael");
        tmp6.setLastName("Nazareth");

        Developer tmp7 = new Developer();
        tmp7.setExperience(3.6);
        tmp7.setFirstName("Philip");
        tmp7.setLastName("Peterson");

        Developer tmp8 = new Developer();
        tmp8.setExperience(0.25);
        tmp8.setFirstName("Sarah");
        tmp8.setLastName("J Watson");

        Developer tmp9 = new Developer();
        tmp9.setExperience(8.0);
        tmp9.setFirstName("Nickolay");
        tmp9.setLastName("Sentyabr");

        ArrayList<Developer> govnocoders0 = new ArrayList<>();
        ArrayList<Developer> govnocoders1 = new ArrayList<>();
        ArrayList<Developer> govnocoders2 = new ArrayList<>();

        Department dep0 = new Department();
        dep0.setName("Android");
        dep0.setFloor(1);
        dep0.setDeveloperList(govnocoders0);
        dep0.getDeveloperList().add(tmp0);
        dep0.getDeveloperList().add(tmp1);
        dep0.getDeveloperList().add(tmp2);
        dep0.getDeveloperList().add(tmp3);

        Department dep1 = new Department();
        dep1.setName("iOS");
        dep1.setFloor(2);
        dep1.setDeveloperList(govnocoders1);
        dep1.getDeveloperList().add(tmp4);
        dep1.getDeveloperList().add(tmp5);
        dep1.getDeveloperList().add(tmp6);

        Department dep2 = new Department();
        dep2.setName("Server");
        dep2.setFloor(3);
        dep2.setDeveloperList(govnocoders2);
        dep2.getDeveloperList().add(tmp7);
        dep2.getDeveloperList().add(tmp8);
        dep2.getDeveloperList().add(tmp9);

        ArrayList<Department> googleDepartments = new ArrayList<>();

        Galera rabota = new Galera();
        rabota.setName("Google");
        rabota.setAge(10);
        rabota.setDepartmentArrayList(googleDepartments);
        rabota.getDepartmentArrayList().add(dep0);
        rabota.getDepartmentArrayList().add(dep1);
        rabota.getDepartmentArrayList().add(dep2);
    }
}
