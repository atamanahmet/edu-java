import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {
    private List<Person> employees;

    public Employees() {
        this.employees = new ArrayList<>();
    }

    public void add(Person personToAdd) {
        if (!this.employees.contains(personToAdd)) {
            this.employees.add(personToAdd);
        }

    }

    public void add(List<Person> personListToAdd) {
        Iterator<Person> iterator = personListToAdd.iterator();
        while (iterator.hasNext()) {

            this.employees.add(iterator.next());
        }
    }

    public void print() {
        Iterator<Person> it = this.employees.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());

        }
    }

    public void print(Education edu) {
        Iterator<Person> it = this.employees.iterator();
        while (it.hasNext()) {
            Person person = it.next();
            if (person.getEducation() == edu) {
                System.out.println(person);
            }
        }

    }

    public void fire(Education edu) {
        Iterator<Person> itFire = this.employees.iterator();
        while (itFire.hasNext()) {
            Person person = itFire.next();
            if (person.getEducation() == edu) {
                itFire.remove();
            }
        }
    }

}
