import java.util.HashSet;
import java.util.Set;

public class Employee {
    private  int salary;
    private Set<Skills> skills = new HashSet<>();

    public Employee(int salary) {
        this.salary = salary;
    }

    public Employee(int salary, Set<Skills> skills) {
        this.salary = salary;
        this.skills = skills;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public Set<Skills> getSkills() {
        return skills;
    }

    void addSkills(Skills skill){
        skills.add(skill);
    }
}
